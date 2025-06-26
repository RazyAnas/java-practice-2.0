package ReverseArrayChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 2, 6, 8, 5};
        System.out.println("Before reverse our array was: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("After reverse our array become: " + Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int... args){
//        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length - 1 ; i++){

            for (int j = i+1; j < args.length; j++) {
                int temp = args[i];
                args[i] = args[j];
                args[j] = temp;
            }

        }
        return args;
    }
}
