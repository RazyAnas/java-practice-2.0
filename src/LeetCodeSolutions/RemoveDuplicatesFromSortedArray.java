package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] arr) {

        if ((arr.length) == 0) return 0;
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j] && j != i+1) {
                    arr[j-1] = arr[j];
                    size--;
                }
            }
        }
        return size;
    }
}
