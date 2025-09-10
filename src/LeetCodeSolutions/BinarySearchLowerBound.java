package LeetCodeSolutions;
// "Where can x fit in without breaking the order?"
public class BinarySearchLowerBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBound(arr, x));
    }
    public static int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int lowerBound = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                lowerBound = mid;

                high = mid-1;

            } else if (nums[mid] < x) {
                low = mid + 1;
            }

        }
        return lowerBound;
    }
}
