package SetsAndMaps;

import java.util.*;

public class TreeSetMain {

// Intro to TreeSet and NavigableSet
    public static void main(String[] args) {
        String divider = "_".repeat(30);
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

//       If your element don't implement Comparable you must pass a comparator to the constructor.
        Comparator<Contact> mySort = Comparator.comparing(Contact::getName);
        NavigableSet<Contact> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        System.out.println(divider); // divider

        NavigableSet<Contact> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        System.out.println(divider); // divider

        // duplicates will be there
        List<Contact> fullList = new ArrayList<>(phones); // get phones
        fullList.addAll(emails); // get emails
        fullList.sort(sorted.comparator());
        fullList.forEach(System.out::println);

        Contact min = Collections.min(fullSet, fullSet.comparator());
        Contact max = Collections.max(fullList, fullSet.comparator());

        Contact first = fullSet.first();
        Contact last = fullSet.last();

        System.out.println(divider); // divider

        System.out.printf("min = %s, first=%s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last=%s %n", max.getName(), last.getName());

        System.out.println(divider); // divider

        NavigableSet<Contact> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst()); // does the same but removes the element from the set also
        System.out.println("Last element = " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);

        System.out.println(divider); // divider

        Contact daffy = new Contact("Daffy Duck");
        Contact daisy = new Contact("Daisy Duck");
        Contact snoopy = new Contact("Snoopy");
        Contact archie = new Contact("Archie");

        // Contact first = fullSet.first(); --> first/last
        for (Contact c : List.of(daffy, daisy, last, snoopy)) {
            // ceiling --> greater than or equal to the element passed
            System.out.printf("ceiling(%s)=%s%n", c.getName(), fullSet.ceiling(c));
            // higher --> always returns next greater value
            System.out.printf("higher(%s)=%s%n", c.getName(), fullSet.higher(c));
        }

        System.out.println(divider); // divider

        for (Contact c : List.of(daffy, daisy, first, archie)) {
            // ceiling --> greater than or equal to the element passed
            System.out.printf("floor(%s)=%s%n", c.getName(), fullSet.floor(c));
            // higher --> always returns next greater value
            System.out.printf("lower(%s)=%s%n", c.getName(), fullSet.lower(c));
        }

        System.out.println(divider); // divider

        // descending sorted order
        NavigableSet<Contact> descendingSet = fullSet.descendingSet();
        descendingSet.forEach(System.out::println);

        System.out.println(divider); // divider

        Contact lastContact = descendingSet.pollLast(); // gets and remove the element
        System.out.println("Removed " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println(divider); // divider
        fullSet.forEach(System.out::println);

        System.out.println(divider); // divider

        Contact marion = new Contact("Maid Marion");
        // headSet = items before (like head → top part → earlier)
        var headSet = fullSet.headSet(marion, true);
        headSet.forEach(System.out::println);

        System.out.println(divider); // divider

        // tailSet = items after (like tail → back part → later)
        var tailSet = fullSet.tailSet(marion, false);
        tailSet.forEach(System.out::println);

        System.out.println(divider); // divider


    }
}

/*
Elements which implement Comparable (said to have a natural order sort,
like strings and numbers) can be element of a TreeSet.

If your element don't implement Comparable you must pass a comparator to the con0structor.
 */
