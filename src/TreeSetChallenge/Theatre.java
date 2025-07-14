package TreeSetChallenge;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {

    private String theatreName;
    // "an integer for seats in each row" --> e.g., 10 seats in a row.
    private int seatsPerRow; // how many seats are in a single row
    // "a field for the seats themselves" --> this means the actual seats, like maybe a 2D array showing seat availability (booked or not).
    NavigableSet<String> seats = new TreeSet<>();
    private int totalRows;

    public Theatre(String theatreName, int seatsPerRow, int totalRows) {
        this.theatreName = theatreName;
        this.seatsPerRow = seatsPerRow;
        this.totalRows = totalRows;
        // auto-create seats like A1, A2, ..., B1, B2, ...
        for (char row = 'A'; row < 'A' + totalRows; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                String seatLabel = row + String.format("%03d", seatNum);
                seats.add(seatLabel);
            }
        }
    }

    public void printSeatMap() {

        char currentRow = ' ';

        for (String s : seats) {
            if (s.charAt(0) != currentRow) {
                if (currentRow != ' ') System.out.println(); // break line for new row
                currentRow = s.charAt(0);
            }
            System.out.print(s + " ");
        }

    }

    // booking agent books the seat
    public void bookSeat(String seatLabel) {


    }

}
