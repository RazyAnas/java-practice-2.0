package LeetCodeSolutions;

import java.util.Arrays;

public class MergeSortedArray {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // we have sorted arrays with length given so we dont need to find lth
            // we have to merge at 0 the last numbers from nums2

            // // left pointer for num1
            // if (m == 0) {
            //     m = 1;
            // }
            // m = m - 1;


            // method 2
            // Stack<Integer> stack = new Stack<>();
            // int leftOfNum1 = 0;
            // int leftOfNum2 = 0;

            // while (leftOfNum1 < m && leftOfNum2 < n) {
            //     if (nums1[leftOfNum1] <= nums2[leftOfNum2]) {
            //         stack.push(nums1[leftOfNum1++]);
            //     } else {
            //         stack.push(nums2[leftOfNum2++]);
            //     }
            // }

            // while (leftOfNum1 < m) {
            //     stack.push(nums1[leftOfNum1++]);
            // }

            // while (leftOfNum2 < n) {
            //     stack.push(nums2[leftOfNum2++]);
            // }

            // Integer[] arr = stack.toArray(new Integer[0]);
            // for (int i = 0; i < arr.length; i++) {
            //     nums1[i] = arr[i];
            // }


            // method 3:
            int i = m -1;
            int j = n - 1;
            int k = m+n - 1;

            while (j >= 0 && i >= 0) {
                if (nums1[i] <= nums2[j]) {
                    nums1[k--] = nums2[j--];
                } else {
                    nums1[k--] = nums1[i--];
                }
            }
            // if nums2 still has elements left
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }

        }


}
