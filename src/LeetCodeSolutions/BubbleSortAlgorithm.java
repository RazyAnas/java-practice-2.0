package LeetCodeSolutions;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    // hard definition --> pushes maximum to the last
    // Bubble Sort only compares side-by-side (i and i+1).

    public static void main(String[] args) {
        int[] nums = {5,10,20,1,2,5,6};
        // {5,6,20l,1,2,5,10r}
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {

        // keep going through each number select and swap with all other numbers until right > left keep going right--
        // if we have to compare one element with all the elements we should start two pointer from left and keep increasing right+1 left
        int n = nums.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n+1; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
