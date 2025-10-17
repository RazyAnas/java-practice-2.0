package LeetCodeSolutions;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5,13891734};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low, j = high;
        while (i < j) {

            // move i till element > pivot
            while (a[i] <= pivot) i++;
            // move j till element < pivot
            while (a[j] > pivot) j--;

            // swap if still i < j
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // swap ele l with ele at j
        a[low] = a[j];
        a[j] = pivot;
        return j;
    }
}
