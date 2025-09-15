package LeetCodeSolutions;

public class NumberOfRotationsBinary {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        System.out.println(findKRotation(nums));
    }
    public static int findKRotation(int[] nums) {
        int n = nums.length, low = 0, high = n - 1;
        int result = Integer.MAX_VALUE;
        while (high >= low) {
            int mid = (low + high)/2;
            if (nums[low] <= nums[high]) {
                // it is sorted
                // therefore
                result = Math.min(result, nums[low]);
                return low;
            }
            else if (nums[low] <= nums[mid]) {
                // left is sorted
                // if left is sorted lets store the minimum index
                result = Math.min(result, nums[low]);
                // move to other
                low = mid + 1;
            } else {
                // otherwise right is sorted
                result = Math.min(result, nums[mid]);
                high = mid - 1;
            }
        }
        return low;
    }


}
