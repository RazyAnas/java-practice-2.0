package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortAlgorithm {
    // Take one element at a time and insert it in its correct place in the already sorted part.

    public static void main(String[] args) {
        int[] nums = {5,10,20,1,2,5,6};
        // {5,6,20l,1,2,5,10r}
        System.out.println(Arrays.toString(insertionSort(nums)));
    }

    public static int[] insertionSort(int[] nums) {

        // keep going through each number select and swap with all other numbers until right > left keep going right--
        // if we have to compare one element with all the elements we should start two pointer from left and keep increasing right+1 left
        int n = nums.length - 1;
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            // current element inside the arr to be inserted
            for (int j = 0; j < n; j++) {

            }

        }
        return arr;
    }
}
