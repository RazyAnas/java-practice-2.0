package LeetCodeSolutions;

import java.math.BigInteger;
import java.util.*;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2,1,0};   // Example input
        int[] result = plusOne(digits);   // call method
        System.out.println(Arrays.toString(result)); // print array

    }
    public static int[] plusOne(int[] digits) {
        // we have a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from the most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
        // Increment the large integer by one and return the resulting array of digits
        // first solve using brute force method

        BigInteger num = BigInteger.valueOf(0);
        // O(n) complexity
        for (int i = 0; i < digits.length; i++) {

            // 9 2 1
            // arr[0] arr[1] arr[2]
            // we need to multiply 10 to first position = 90,
            // then add 2 = 92 then multiply 10, 920 then add 2...
            // what recursion is happening here?:
            // we are doing num = num * 10 + digit[i]
            num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(digits[i]));
            System.out.println(num);
        }
        num = num.add(BigInteger.valueOf(1));
        System.out.println(num);
        ArrayList<BigInteger> numList = new ArrayList<>();
        while (num.compareTo(BigInteger.ZERO) > 0) {
            // how to get 9,2,2 from 922
            // mod of 922 % 10 = 2 (put it in) and then 922 / 10 = 92
            // so at last we would get 2,2,9,
            // but we don't want this
            // so we will make it 229
            // then do the mod again and make it 922
            BigInteger digit = num.mod(BigInteger.valueOf(10));
            numList.add(digit);
            num = num.divide(BigInteger.valueOf(10));

        }

        Collections.reverse(numList);

        int[] result = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            result[i] = Integer.parseInt(String.valueOf(numList.get(i)));
        }

        return result;
    }
}
