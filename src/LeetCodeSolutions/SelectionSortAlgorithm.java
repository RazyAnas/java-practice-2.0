package LeetCodeSolutions;

import java.util.Arrays;

public class SelectionSortAlgorithm {

    // it basically says to select the minimums and swap
    // i think this can be done with two pointers
    // the left pointer at 0
    // right pointer one ahead of left pointer
    // keep swapping till left < right

    public static void main(String[] args) {
        int[] nums = {5,10,20,1,2,5,6};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
    public static int[] selectionSort(int[] nums) {

        // keep going through each number select and swap with all other numbers until right > left keep going right--
        // if we have to compare one element with all the elements we should start two pointer from left and keep increasing right+1 left
        int n = nums.length;
        for (int left = 0; left < n - 1; left++) {
            int right = left + 1;
            while (right < n) {
                if (nums[left] > nums[right]) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                right++;
            }
        }

        return nums;
    }
}
