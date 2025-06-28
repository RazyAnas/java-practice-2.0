package ArrayAndArrayLists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // its just a List wrapper not a real List we cannot add or remove anything. It is immutable array
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add(String.valueOf(0));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        

    }
}
