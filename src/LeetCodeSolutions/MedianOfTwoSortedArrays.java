package LeetCodeSolutions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7};

        System.out.println(findMedianSortedArrays(array1, array2));
    }

    public static double findMedianSortedArrays(int[] array1, int[] array2) {
        // given:
        // two sorted arrays
        // nums1(m --> size) and nums2(n --> size)
        // return the median of two sorted arrays

        // what we have to do?:
        // is do binary search in nums1 and then nums2 separately
        int[] merged = new int[array1.length + array2.length];

        // Copy elements from array1 to mergedArray
        System.arraycopy(array1, 0, merged, 0, array1.length);

        // Copy elements from array2 to mergedArray, starting after array1's elements
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        int n = merged.length;
        Arrays.sort(merged);
        if (n % 2 == 0) {// even
            // if even length then return element at (n/2 - 1) and (n/2).
            int a =  merged[n/2 - 1];
            int b = merged[n/2];
            return (a + b) / 2.0;
        } else {
            return merged[n/2];
        }
    }
}
