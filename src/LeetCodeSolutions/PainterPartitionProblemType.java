package LeetCodeSolutions;

public class PainterPartitionProblemType {

        public int shipWithinDays(int[] arr, int days) {

            // given:
            // within "days" days conveyor belt has packages to ship
            // ith package on the conveyor has weight[i]
            // (unload) conveyor --> ship (load) {order of weight array} -->
            // load up to max weight capacity of ship, each day

            // what to do?:
            // the least weight capacity of the ship which will help load ALL PACKAGES
            // with "days" days

            // we are converting weight array as arr array
            int low = 0, high = 0;
            for (int e : arr) {
                low = Math.max(low, e);  // max element
                high += e;               // sum of elements
            }


            int ans = 0;

            while (high >= low) {

                int mid = low + (high - low) / 2;
                int val = func(arr, mid);
                if (val <= days) {
                    ans = mid;
                    high = mid - 1; // check for even lower
                } else {
                    low = mid + 1; // go higher
                }

            }


            return ans;

        }

        public static int func(int[] arr, int mid) {
            int days = 1;
            int weightSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (weightSum + arr[i] <= mid) {
                    weightSum += arr[i];
                } else {
                    days++;
                    weightSum = arr[i];
                }
            }
            return days;
        }


}
