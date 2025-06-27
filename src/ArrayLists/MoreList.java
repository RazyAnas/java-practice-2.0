package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "banana", "milk", "eggs"};
        // immutable list, from Array to List. List.of() → fixed list (unchangeable)
        List<String> list = List.of(items); // converts array to list
        System.out.println(list); // System.out.println() of a list → prints it like an array: [item1, item2, ...]
        // mutable array list
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        nextList.add("chocolates");
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
