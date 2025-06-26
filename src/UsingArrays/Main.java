package UsingArrays;

import java.util.Arrays;
import java.util.Formattable;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // Array ko sort, how??
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // filling array with the same data
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill((secondArray), 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        //  copy array
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        // sorting fourthArray
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray =  Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray =  Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        // finding a match
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        String key = "Mark";
        // binary search only works on sorted array
        if (Arrays.binarySearch(sArray,  key) >= 0) {
            int position = Arrays.binarySearch(sArray, "Mark");
            System.out.println("Found " + key + " at position " + position);
        } else {
            System.out.println("not found!");
        }

        // compare two arrays if they are equal or not
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1}; // Arrays.equal() takes order in account

        if (Arrays.equals(s1, s2)){
            System.out.println("Both arrays " + Arrays.toString(s1) + " & " + Arrays.toString(s2) + " are equal!");
        } else {
            System.out.println("Arrays given are not equal!");
        }
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
