package TreeSetChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;


public class Theatre {

    private String theatreName;
    private int seatsPerRow;
    private int totalRows;
    private NavigableSet<Seat> seats = new TreeSet<>();

    public Theatre(String theatreName, int seatsPerRow, int totalRows) {

        this.theatreName = theatreName;
        this.seatsPerRow = seatsPerRow;
        this.totalRows = totalRows;

        for (char row = 'A'; row < 'A' + totalRows; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                seats.add(new Seat(row, seatNum));
            }
        }
    }

    public void printSeatMap() {

        char currentRow = ' ';
        for (Seat seat : seats) {
            if (seat.row != currentRow) {
                if (currentRow != ' ') System.out.println();
                currentRow = seat.row;
            }

            if (seat.isReserved) {
                StringBuilder striked = new StringBuilder();
                for (char ch : seat.label.toCharArray()) {
                    striked.append(ch).append("\u0336");
                }
                System.out.print(striked + " ");
            } else {
                System.out.print(seat.label + " ");
            }
        }
        System.out.println();
    }

    public void bookSeat(String label) {

        for (Seat seat : seats) {
            if (seat.label.equals(label)) {
                if (seat.isReserved) {
                    System.out.println(label + " is already booked.");
                } else {
                    seat.isReserved = true;
                    System.out.println(label + " booked successfully.");
                }
                return;
            }
        }
        System.out.println("Seat " + label + " doesn't exist.");
    }

    public void reserveSeats(int count, char fromRow, char toRow, int fromSeatNum, int toSeatNum) {
        for (char row = fromRow; row <= toRow; row++) {
            for (int seatStart = fromSeatNum; seatStart <= toSeatNum - count + 1; seatStart++) {

                boolean allAvailable = true;
                List<Seat> block = new ArrayList<>();

                for (int i = 0; i < count; i++) {
                    String seatLabel = row + String.format("%03d", seatStart + i);
                    Seat seat = findSeatByLabel(seatLabel);
                    if (seat == null || seat.isReserved) {
                        allAvailable = false;
                        break;
                    }
                    block.add(seat);
                }


                if (allAvailable) {
                    for (Seat seat : block) {
                        seat.isReserved = true; // direct booking without extra check
                        System.out.println(seat.label + " booked successfully.");
                    }
                    return; // done booking
                }
            }
        }
    }
    private Seat findSeatByLabel(String label) {
        for (Seat seat : seats) {
            if (seat.label.equals(label)) {
                return seat;
            }
        }
        return null; // not found
    }

    class Seat implements Comparable<Seat>{

        private char row;
        private int number;
        private String label;
        private boolean isReserved = false;


        public Seat(char row, int number) {
            this.row = row;
            this.number = number;
            this.label = row + String.format("%03d", number);
        }

        @Override
        public int compareTo(Seat other) {
            if (this.row == other.row) {
                return this.number - other.number;
            }
            return this.row - other.row;
        }

    }

}
