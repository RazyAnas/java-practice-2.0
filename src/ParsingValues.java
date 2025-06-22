import java.util.Scanner;

public class ParsingValues {
    public static void main(String[] args) {
        int currentYear = 2025;
//        String userYearOfBirth = "2004";
//        int yearOfBirth = Integer.parseInt(userYearOfBirth);
//        int age = currentYear - yearOfBirth;
//        System.out.println("Age = "+age);
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }
    public static  String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " year old";
    }
    public static  String getInputFromScanner(int currentYear){
        return "";
    }


    // String + String gets concatenated
    // wrapper.parseInt(String variable) {here wrapper is Integer}
}
