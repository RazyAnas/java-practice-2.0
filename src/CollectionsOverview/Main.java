package CollectionsOverview;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // A collection is an object that represents a group of objects (like Vector).
        // The goals of Java's collection framework were:
        //    Easy to learn and use
        //    Small and focused
        //    Doesn’t force major code rewrites
        //    Makes collections easy to interoperate (work together)
        //    Allows optional operations
        //    Focuses on performance and flexibility

        // Arrays and Arrays utilities in the java.util.Arrays class are not considered part of this framework
        // Collection interface is the foundation of the collection hierarchy in Java

        // In Java the term, element refers to member of the collection being managed

//        List<String> list = new ArrayList<>();
        Collection<String> list = new HashSet<>();
        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list?: " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);

       // list.sort(); // Cannot resolve method 'sort' in 'Collection'

    }
}
