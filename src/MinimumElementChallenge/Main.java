package MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readIntegers();
    }

    public static void readIntegers() {
        Scanner sc = new Scanner(System.in);
        String inputNumbers = sc.nextLine();
        String[] splitStrings = inputNumbers.split(",");
        findMin(splitStrings);
    }

    public static void findMin(String... args) {
//        System.out.println(Arrays.toString(args));
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++ ) {
            numbers[i] = Integer.parseInt(args[i].trim());
        }
//        System.out.println(Arrays.toString(numbers));
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // find the highest number
            // Trick to Remember:
            //    temp → holds temporary value
            //    3-step swap:
            //        store
            //        shift
            //        restore
            if (numbers[i]<minimum){
                minimum = numbers[i];
            }
        }
        System.out.println(minimum);
    }
}
