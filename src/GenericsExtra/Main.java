package GenericsExtra;

import GenericsExtra.model.*;
import GenericsExtra.util.*;

import java.util.ArrayList;
import java.util.List;

// record
record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

// check comments at the bottom for more info
public class Main {

    public static void main(String[] args) {


        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
//        printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

//        printList(lpaStudents);
        printMoreList(lpaStudents);

        testList(new ArrayList<>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<>(List.of(5, 10, 25, 89)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python");
        printMoreList(matches);

        var student2021 = QueryList.getMatches(students, "YearStarted", "2021");
        printMoreList(student2021);
    }

    public static void printMoreList(List<? extends Student> students) { // <? extends Student> --> wildcard in the type argument, a lower bound means it can be student or any parent of student not subtype of student represented by: <? super Student>

        // wildcard doesn't know the type list elements
        Student last = students.get(students.size() - 1);
//        students.set(0, last);

        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

    // Type erasure error:
//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

    // generic method
//    public static <T extends Student> void printList(List<T> students) { // <T extends Student>  : this means i can pass Student or LPAStudent in this methods
//
//        for (var student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }
}

// Type Parameters, Type Arguments and using a Wildcard.
/*

Type Parameters:
   A type parameter is a generic class, or a generic method's declaration of the type.
   in both these examples, T is said to be the type parameter.
   you can bind a type parameter with the use of the extends keyword, to specify an upper bound:
   public class Team<T> {}
   public <T> void doSomething(T t) {}

*/

/*

Type argument:
    it declares the type to be used, and is specified in a type reference, such as a local variable reference, method parameter declaration, or field declaration
    in this example, BaseballPlayer is the type argument
    Team<BaseballPlayer> team = new Team<>();

*/

/*

Wildcard:
    A wildcard can only be used in a type argument, not in the type parameter declaration.
    A wildcard can be represented by a ? character
    A wildcard means the type is unknown
    For this reason, a wildcard limits what you can do, when you specify a type this way
    List<?> unknownList;

    A wildcard cannot be used in an instantiation of a generic class
    the code shown here is invalid:
    var myList = new ArrayList<?>();

    A wildcard can be unbounded, or alternately specify either an upper bound or lower bound.
    You cant specify both an upper bound and a lower bound in the same declaration.

*/