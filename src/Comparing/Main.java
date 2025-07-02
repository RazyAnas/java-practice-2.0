package Comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);

        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (var fruits : fruit) {
            int val = banana.compareTo(fruits);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), fruits, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        // Java considers lowercase letters (a-z) > uppercase letters (A-Z) because of Unicode/ASCII values.
        System.out.println("A:" + (int)'A' + " " + "a:" + (int)'a');
        System.out.println("B:" + (int)'B' + " " + "b:" + (int)'b');
        System.out.println("P:" + (int)'P' + " " + "p:" + (int)'p');

        Student anas = new Student("Anas");
        Student [] students = {new Student("Mariya"), new Student("Khushi"), new Student("Raiyan"), new Student("Tasneem")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + anas.compareTo(new Student("ANAS"))); // 32 is the difference between any uppercase letter and a lowercase letter

        Comparator<Student> gpaSorted = new StudentGPAComparator();
        Arrays.sort(students, gpaSorted.reversed());
        System.out.println(Arrays.toString(students));

    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {

    private static int LAST_ID = 1000; // LAST_ID is a constant
    // static int LAST_ID = 1000;
    //    This is a shared counter for all students.
    //    Every new student gets a new unique id using this.
    //    If it was just int LAST_ID = 1000;, each student would start from 1000 → all would have same ID.
    private static Random random = new Random();

    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

//
//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

}
