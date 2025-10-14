package LeetCodeSolutions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,6,7,3,1,7,9,12,345,34534345,34526777};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return; // base case
        int middle = low + (high - low) / 2; // correct mid
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        merge(array, low, middle, high);
    }

    public static void merge(int[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;        // left half pointer
        int right = middle + 1; // right half pointer
        int lowest = 0;          // temp write pointer

        while (left <= middle && right <= high) {
            if (array[left] <= array[right]) {
                temp[lowest++] = array[left++];
            }
            else {
                temp[lowest++] = array[right++];
            }
        }
        while (left <= middle) {
            temp[lowest++] = array[left++];
        }
        while (right <= high)  {
            temp[lowest++] = array[right++];
        }

        for (int p = 0; p < temp.length; p++) array[low + p] = temp[p];
    }
}
