package TreeSetChallenge;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Rajnigandha", 10, 10);

        // Book a single seat
        theatre.bookSeat("A003");

        // Print initial map
        theatre.printSeatMap();

        // Book a block of 4 contiguous seats from A001 to C010
        theatre.reserveSeats(4, 'A', 'C', 1, 10);

        // Print updated map
        theatre.printSeatMap();
    }
}

