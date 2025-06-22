import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        int count = 0;
        int number = 0;
        int minimum = number;
        int maximum = number;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String num = sc.next();
                number = Integer.parseInt(num);
                count++;
                if (count == 1){
                    minimum = number;
                    maximum = number;

                } else {
                    if (number < minimum) {
                        minimum = number;
                    }
                    if (number > maximum) {
                        maximum = number;
                    }
                }

            } catch (Exception e) {

                System.out.println("Your maximum number is " + maximum + " and your minimum number is " + minimum);
                break;
            }
        }

    }


}
