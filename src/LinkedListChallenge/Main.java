package LinkedListChallenge;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static final LinkedList<Place> places = new LinkedList<>();
    private static ListIterator<Place> iterator = places.listIterator();

    public static void main(String[] args) {


        // add places to the list - khunti should be the first element in my list
        places.add(new Place("Chennai", 2500)); // Gurgaon --> Chennai
        places.add(new Place("Khunti", 1));
        places.add(new Place("Ranchi", 45.8)); // khunti --> Ranchi
        places.add(new Place("Gurgaon", 1800)); // Ranchi --> Gurgaon
        places.add(new Place("Vellore", 2580)); // Chennai --> Vellore

        // list.sort(Comparator.comparing(Class::method));
        places.sort(Comparator.comparing((Place::getDoori))); // for sorting based on distance
        iterator = places.listIterator(); // ✅ add this line
        System.out.println(places);


        getInputs();
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
