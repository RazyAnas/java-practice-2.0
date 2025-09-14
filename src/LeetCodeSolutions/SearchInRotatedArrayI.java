package LeetCodeSolutions;

public class SearchInRotatedArrayI {
    public static void main(String[] args) {

    }
        public int search(int[] nums, int target) {
            // given:
            // nums array sorted with distinct values --> Arrays.binarySearch
            // nums is possibly left rotated

            // identify the sorted half
            int n = nums.length;
            int high = n -1;
            int low = 0;

            while (high >= low) {
                int mid = (high + low) / 2;
                if (nums[mid] == target) return mid;

                // identify the sorted half
                // left half
                if (nums[low] <= nums[mid]) {
                    // is the number in between you?
                    if (nums[low] <= target && target <= nums[mid]) {
                        // yes so eliminate the right half
                        high = mid - 1;
                    } else {
                        // otherwise eliminate the left half since it dont have
                        low = mid + 1;
                    }
                } else {
                    // is the number in between you?
                    if (nums[high] >= target && target >= nums[mid]) {
                        // if yes then eliminate the left half
                        low = mid + 1;
                    } else {
                        // eliminate the right half
                        high = mid - 1;
                    }
                }
            }
            return -1;
        }

}
