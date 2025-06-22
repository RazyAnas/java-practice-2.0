import java.util.Scanner;

public class ParsingValues {
    public static void main(String[] args) {
        int currentYear = 2025;
//        String userYearOfBirth = "2004";
//        int yearOfBirth = Integer.parseInt(userYearOfBirth);
//        int age = currentYear - yearOfBirth;
//        System.out.println("Age = "+age);
        try {
            System.out.println(getInputFromConsole(currentYear));
        }
        catch (NullPointerException e){
            System.out.println("Error occurred falling back to Scanner instead of System console...");
            System.out.println(getInputFromScanner(currentYear));
        }


    }
    public static  String getInputFromConsole (int currentYear){
        // IDE disable the console, only using command line
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " year old";
    }
    public static  String getInputFromScanner(int currentYear){

        Scanner sc = new Scanner(System.in);
        System.out.print("Hi, What's your Name? ");
        String name = sc.nextLine();
        System.out.println("Hi "+ name + ", Thanks for taking the course!");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a valid year");
            try {
                age = checkData(currentYear, sc.nextLine());
                validDOB = age >= 0;
            } catch (Exception e){
                 System.out.println("Characters not allowed! Try again..");
                 validDOB = false;
            }
        } while (!validDOB);
        return "So you are " + age + " year old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return currentYear - dob;
    }


    // String + String gets concatenated
    // wrapper.parseInt(String variable) {here wrapper is Integer}
}
