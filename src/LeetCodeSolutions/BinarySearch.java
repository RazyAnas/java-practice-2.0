package LeetCodeSolutions;

public class BinarySearch {
    public static void main(String[] args) {

    }

        public int search(int[] nums, int target) {
            // for binary search we need sorted array
            // define left, right
            int n = nums.length;
            int left = 0;
            int right = n-1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) return mid;

                    // agar target chota hai mid waale se toh
                else if (nums[mid] > target) {
                    right = mid - 1;
                }

                // agar target bada hai mid waale se toh
                else if (nums[mid] < target) {
                    left = mid + 1;
                }
            }
            return -1;
        }

}
