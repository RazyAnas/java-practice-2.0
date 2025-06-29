package LinkedListChallenge;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static LinkedList<Place> places = new LinkedList<>(); // if already a place exist, it cannot be added
    private static ListIterator<Place> iterator = places.listIterator();

    public static void main(String[] args) {


        // add places to the list - khunti should be the first element in my list
        addPlace(new Place("Chennai", 2500));
        addPlace(new Place("Khunti", 1));
        addPlace(new Place("Khunti", 1)); // This will now be ignored
        addPlace(new Place("Ranchi", 45.8));
        addPlace(new Place("Gurgaon", 1800));
        addPlace(new Place("Vellore", 2580));

        // list.sort(Comparator.comparing(Class::method));
        places.sort(Comparator.comparing((Place::doori))); // for sorting based on distance
        iterator = places.listIterator(); // ✅ add this line
        System.out.println(places);


        getInputs();
    }
    public static void addPlace(Place newPlace) {
        for (Place p : places) {
            if (p.getJagah().equalsIgnoreCase(newPlace.getJagah())) {
                System.out.println("Duplicate " + p + " found, skipping...");
                return; // already exists, so don't add
            }
        }
        places.add(newPlace); // only add if not duplicate
    }


    private static void getInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
        boolean flag = true;
        while (flag) {
            char choice = Character.toUpperCase(sc.next().charAt(0));
            switch (choice) {
                case 'F' -> interaction('F'); // forward the pointer
                case 'B' -> interaction('B'); // backward the pointer
                case 'L' -> interaction('L'); // list the places
                case 'M' -> {
                    flag = false; // quit previous menu, before starting a new menu
                    interaction('M');
                } // menu
                case 'Q' -> {
                    flag = false;
                    System.out.println("Exiting menu, Goodbye!");

                } // quit
                default -> System.out.println("Option doesn't exist"); // if no such options selected
            }
        }
    }

    private static void interaction(char choice) {


        if (choice == 'F') {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            } else {
                System.out.println("Reached end of the list");
            }
        } else if (choice == 'B') {
            if (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            } else {
                System.out.println("Reached start of the list");
            }
        } else if (choice == 'L') {
            System.out.println(places);
        } else {
            getInputs();
        }

    }

}
