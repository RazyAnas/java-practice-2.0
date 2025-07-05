package LambdaMiniChallenges.MiniChallenge1;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // without lambda
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts  = sentence.split(" ");
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


    }
}
