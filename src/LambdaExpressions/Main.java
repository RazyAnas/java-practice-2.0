package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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
        Not on "how" the computer does it (like loops or step-by-step).

         */

        int result = calculator((var a , var b) -> a + b, 5,2);
        var result2 = calculator(( a , b) -> a / b, 10.0,2.5);
        var result3 = calculator((a,b) -> a.toUpperCase() + " " + b.toUpperCase(), "anas", "razy");

        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        BiConsumer<Double,Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("-".repeat(10));
        coords.forEach(s -> processPoint(s[0], s[1], p1));
        coords.forEach(s -> processPoint(s[0], s[1],
                (lat, lng) ->
                        System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(System.out::println);

        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(System.out::println);

        System.out.println("-".repeat(10));
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(System.out::println);

        System.out.println("-".repeat(10));
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        list.forEach(System.out::println);

        System.out.println("-".repeat(10));
        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyStrings));

        System.out.println("-".repeat(10));
        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". "
            + switch (i) {
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            case 3 -> "four";
            case 4 -> "five";
            case 5 -> "six";
            default -> "number";
            }
        );
        System.out.println(Arrays.toString(emptyStrings));

        System.out.println("-".repeat(10));
        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(15, names,
                () -> new Random().nextInt(0, names.length)); // no args lambda expression
        System.out.println(Arrays.toString(randomList));

    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values,
                                                  Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i ++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}

/*

NOTE:
"Method = box"
"Lambda = what goes inside the box"

 */