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
        int n = nums.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = nums[i];   // element to insert in sorted portion
            int j = i - 1;

            // Shift all elements greater than key to one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Place the key at its correct position
            nums[j + 1] = key;
        }

        return nums;
    }

}
