package ArrayChallenge;
/*
The Array Challenge

Create a program using arrays that sorts a list of integers in descending order.
Descending order means from the highest value to lowest.

Example: If the array has the values 50, 25, 80, 5, and 15,
the program should return an array with the values in this order:
80, 50, 25, 15, 5

Steps:
1. Create an array of randomly generated integers.
2. Print the array before sorting.
3. Sort the array in descending order.
4. Print the array after sorting.

Note: You can either sort the existing array or create a new sorted array.
*/


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = getRandomArray(10);
        // printing before sorting
        System.out.println(Arrays.toString(arr));
        // sorting the array -> but in descending order not ascending
        System.out.println(Arrays.toString(sortIntegers(arr)));

        // printing after sorting

    }
    // random numbers array create
    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i ++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        // boolean

        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    // swap array[i] and array[j]
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }


        return sortedArray;


    }
}
