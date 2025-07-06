package LambdaExpressionChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> firstNames = new ArrayList<>(
                List.of("Anas", "bob" ,"mom", "Pasha", "Nigger")
        );

        firstNames.replaceAll(s -> {
            s = s.toUpperCase();
            System.out.println(s);
            System.out.println("-".repeat(10));

            Random rand = new Random();
            char randomChar = (char) ('A' + rand.nextInt(26));
            String reversed = new StringBuilder(s).reverse().toString();

            s = s.concat(" " + String.valueOf(randomChar) + ".");

            firstNames.forEach(System.out::println);
            System.out.println("-".repeat(10));

            s = s.concat(" " + reversed);

            System.out.println(s);
            System.out.println("-".repeat(10));

            return s;
        });

        firstNames.removeIf(s -> {
            String[] parts = s.split(" ");
            return parts[0].equals(parts[2]);  // check if 1st and 3rd name are same
        });

        System.out.println("/".repeat(10));
        ArrayList<String> names = new ArrayList<>(firstNames);
        names.forEach(System.out::println);
    }
}
