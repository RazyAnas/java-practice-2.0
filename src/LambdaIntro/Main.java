package LambdaIntro;

import LambdaExpressions.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

        // using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

//        people.sort(comparatorLastName);

        // lambda expression =>
        // (parameter1, parameter2, ... ) -> expression;
        // usually parameters are in bracket but not always

        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName)); // Arrow means: “do this with the inputs”
        System.out.println(people);

        // method is inferred by java from the lambda expression, but nigga how?
        // Java takes its clue from the reference type, in the context of the lambda expression usage
        // Only one method allowed = functional interface = allowed in lambda

        // annotation --> check if it's a functional interface or not?
//        @FunctionalInterface
        interface EnhancedComparator<T> extends Comparator<T> {

            int secondLevel(T o1, T o2);
        }

        // we cant convert this to a lambda expression as this is not technically a functional interface
        var comparatorMixed = new EnhancedComparator<Person>() {

            // interfaces inherits abstract methods.
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);
    }


}
