package LeetCodeSolutions;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {

    }
        public boolean search(int[] nums, int target) {

            // given:
            // array of nums sorted
            // not distinc may contain duplicate
            // cant apply binarySearch function
            // now nums are rotated at unknown index

            // this question is about rotated with duplicate numbers

            // what we need to do?:
            // find true or false if target is in nums

            int n = nums.length, low = 0, high = n - 1;

            while (high >= low) {


                int mid = (high + low) / 2;
                if (nums[mid] == target) return true;
                // Handle duplicates --> shrink krwa doh
                if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                    low++;
                    high--;
                }
                // other wise check if the left is sorted
                // left sorted
                else if (nums[low] <= nums[mid]) {
                    // yes sorted
                    // then check if the number is in between it
                    if (nums[low] <= target && target <= nums[mid]) {
                        // if its in left
                        // remove right
                        high = mid - 1;
                    } else {
                        // if its not there remove the left array
                        low = mid + 1;
                    }
                } else {
                    // if right is sorted
                    // check if the number is between it
                    if (nums[high] >= target && target >= nums[mid]) {
                        // if it is in between right
                        // remove left
                        low = mid + 1;
                    } else {
                        // if its not there in right array --> remove right array
                        high = mid - 1;
                    }

                }

            }
            return false;
        }

}
