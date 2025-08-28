package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] arr) {

        int left = 0;               // first pointer at start
        int right = arr.length - 1; // second pointer at end
        ArrayList list = new ArrayList<>(List.of(arr));
        while (left < right) {
            if (arr[left] == arr[right]) {
                Arrays.asList(arr.clone()).remove(arr[right]);
            }
            // move pointers inward
            left++;
            right--;
        }

        return arr.length;
    }
}
