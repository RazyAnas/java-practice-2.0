package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("sydney");
        placesToVisit.add(0, "Canberra");

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);

//        gettingElements(placesToVisit);
//        System.out.println(placesToVisit);

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit); // limitations
        printItinerary3(placesToVisit);


        testIterator(placesToVisit);


        testListIterator(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        //Queue method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        //stack methods
        list.push("Alice Springs");

    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();  // removes first element
        System.out.println(s1 + " was removed");

        System.out.println(list);
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        System.out.println(list);
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        System.out.println(list);
        // Queue/Deque poll methods
        String p1 = list.poll(); // removes whatever is first
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        System.out.println(list);
        String p4 = list.poll();
        System.out.println(p4 + " was removed");

        list.push("Sydney"); // pushes to the top of the stack!
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println(list);

        // stack removing method
        String s4 = list.pop(); // removes top element
        System.out.println(s4 + " was removed");

    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4)); // get specified index element

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " +
                list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " +
                list.indexOf("Melbourne"));

        // Queue retrieval method (FIFO)
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval method
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at = " + list.getFirst());
//        LinkedList<String> placesInBetween = new LinkedList<>();
//        for (int i = 1; i < list.size() - 1; i++) {
//
//            String places = list.get(i);
//
//            placesInBetween.add(places);
//        }
//
//        System.out.println("Places visited in between the trip" +
//                "except the starting and ending points are: " + placesInBetween );

        for (int i = 1; i < list.size(); i++) {

            System.out.println("--> from: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Tripe ends at = " + list.getLast());
    }

// Limitations
    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("\n\n\nTrip starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("---> From: " + previousTown + " to "
                    + town);
            previousTown = town;
        }
        System.out.println("Tripe ends at = " + list.getLast());
    }

    // ListIterator: same problem as enhanced for loop, but fixed by defining index
    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("\n\n\nTrip starts at = " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) { // has next return true if there are more elements in the list
            var town = iterator.next();
            System.out.println("---> From: " + previousTown + " to "
                    + town);
            previousTown = town;
        }
        System.out.println("Tripe ends at = " + list.getLast());
    }

    // iterator in details

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
            }

        }
        System.out.println(list);
    }

    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Toowoomba")) {
                iterator.add("Lake Ivanhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
//        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }
}

