package LeetCodeSolutions;

import java.util.Arrays;

public class GetFloorAndCeil {

    public static void main(String[] args) {
        int[] integers = {2, 4, 6, 8, 10, 12, 14};


        System.out.println(Arrays.toString(getFloorAndCeil(integers, 8)));
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        // our brute force technique should be?:
        // we need to go and check every element in the list
        // math.min check if the number is smaller or equal to the x
        // math.min check if the number is larger than or equal to x
        int[] result = new int[2];
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= x) {
                // ceil
                ceil = Math.min(ceil, num);
                result[1] = ceil;
            }

            if (num <= x) {
                // floor
                floor = Math.max(floor, num);
                result[0] = floor;
            }
            if (floor == Integer.MIN_VALUE) floor = -1; // no floor exists
            if (ceil == Integer.MAX_VALUE) ceil = -1;   // no ceil exists
        }
        return result;
    }
}
