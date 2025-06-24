package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, 0, false); // not duplex
        Printer printer2 = new Printer(60, 0, true);  // duplex

        // Test 1: Add toner
        System.out.println("Add toner (30): " + printer1.addToner(30)); // Expected: 80
        System.out.println("Add toner (50): " + printer1.addToner(50)); // Expected: -1 (exceeds 100)
        System.out.println("Add toner (-10): " + printer1.addToner(-10)); // Expected: -1

        // Test 2: Print pages
        System.out.println("Pages printed (non-duplex, 2 pages): " + printer1.printPages(2)); // Expected: 50 / (2*5) = 5
        System.out.println("Pages printed (duplex, 2 pages): " + printer2.printPages(2));     // Expected: (60 / (2*5)) / 2 = 3 / 2 = 1
    }
}
