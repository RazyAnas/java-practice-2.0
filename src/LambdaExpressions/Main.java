package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                // first four words in NATO's phonetic alphabet
                "alpha", "bravo", "charlie", "delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-".repeat(10));
        list.forEach((var myString) -> System.out.println(myString));

        System.out.println("-".repeat(10));
        String prefix = "nato";
//        String myString = "enclosing Method's myString"; --> wrong conflicting
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });

//        System.out.println(myString); --> out of scope --> wrong

        // prefix = "NATO";  --> wrong --> Variable used in lambda expression should be final or effectively final

        /*

        What is functional programming?:

        Functional Programming = style of coding where you:
        Give inputs ➜ Get output ➜ Done.
        No changing variables, no messing with memory.
        Focus on functions that take data → return result
        Not on "how" the computer does it (like loops or step-by-step)

         */
    }
}
