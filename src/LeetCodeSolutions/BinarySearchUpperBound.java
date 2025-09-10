package LeetCodeSolutions;
// "Where can something bigger than x start?"
public class BinarySearchUpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 9;
        System.out.println(upperBound(arr, x));
    }
    public static int upperBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int upperBound = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return upperBound;
    }
}
