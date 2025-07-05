package LambdaMiniChallenges.MiniChallenge1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

// ------------------------------- Mini Challenge 1 ---------------------------------

        // without lambda
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        // with lambda expression
        Consumer<String> printWordsLambda = sentence -> {
            List<String> parts = List.of(sentence.split(" "));
            parts.forEach(System.out::println);
        };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");

        // with lambda expression (concise single line)
        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(System.out::println);
        };

        printWordsConcise.accept("Let's split this up into an array");

        System.out.println("-".repeat(10));

        Function<String, String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // ------------------------------- Mini Challenge 3 --------------------------------

        System.out.println(everySecondChar.apply("1234567890"));

        // ------------------------------- Mini Challenge 5 ---------------------------------

        System.out.println(everySecondCharacter(everySecondChar, "1234567890"));

    }

    // ------------------------------- Mini Challenge 4 ---------------------------------

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }


// ------------------------------- Mini Challenge 2 ---------------------------------

    // without lambda - method
    public static String everySecondChar1(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    // with lambda - method
    UnaryOperator<String> everyOtherSecondChar = source -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };



}
