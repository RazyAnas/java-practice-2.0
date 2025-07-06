package MethodReferenceChallenge;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(List.of("Anas", "Mariya", "Salman", "Bob", "Sina", "Ibrahim", "Gog"));

        List<UnaryOperator<String>> operations = getOperators();

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            for (UnaryOperator<String> op : operations) {
                name = name.transform(op);
            }
            names.set(i, name);
        }

        names.forEach(System.out::println);

        System.out.println("-".repeat(20));

        names.removeIf(s -> {
            String[] parts = s.split(" ");
            return parts.length == 3 && parts[0].equals(parts[2]);
        });

        names.forEach(System.out::println);
        System.out.println("-".repeat(20));
        names.replaceAll(s -> s.transform(Main::addDashes)
        );
        names.forEach(System.out::println);
        System.out.println("-".repeat(20));
        names.replaceAll(s -> s.transform(Main::addSmiley)
        );
        names.forEach(System.out::println);
    }

    private static List<UnaryOperator<String>> getOperators() {
        UnaryOperator<String> uRandomMiddleName = name -> {
            char randomInitial = (char) ('A' + new Random().nextInt(26));
            return name + " " + randomInitial + ".";
        };
        UnaryOperator<String> uLastName = name ->  {
            String[] parts = name.split(" ");
            return name + " " + new StringBuilder(parts[0]).reverse();
        };

        return List.of(
                s -> s.transform(String::toUpperCase),
                s -> s.transform(uRandomMiddleName),
                s -> s.transform(uLastName)

        );
    }

    private static String addDashes(String s) {
        String[] part = s.split( " ");
        return part[0] + "_" + part[1] + "_" + part[2];
    }

    private static String addSmiley(String s) {
        return s +  " 😊" ;
    }
}
