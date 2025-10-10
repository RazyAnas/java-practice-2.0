package LeetCodeSolutions;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    // hard definition --> pushes maximum to the last
    // Bubble Sort only compares side-by-side (i and i+1).
    // time complexity must be O(N)

    public static void main(String[] args) {
        int[] nums = {5,10,20,1,2,5,6};
        // {5,6,20l,1,2,5,10r}
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swaps → already sorted → stop
            if (!swapped) break;
        }

        return nums;
    }

}
