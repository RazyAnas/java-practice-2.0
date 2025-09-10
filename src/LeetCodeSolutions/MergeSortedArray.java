package LeetCodeSolutions;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // we have sorted arrays with length given so we dont need to find lth
        // we have to merge at 0 the last numbers from nums2

        // left pointer for num1
        if (m == 0) {
            m = 1;
        }
        m = m - 1;


        // left pointer for num2
        n = n - 1;

        int k = nums1.length - 1;

        while (m >= 0 && n >= 0) {

            nums1[k--] = nums2[n--];
        }
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);


    }

}
