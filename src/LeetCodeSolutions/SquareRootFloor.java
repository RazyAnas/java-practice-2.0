package LeetCodeSolutions;

public class SquareRootFloor {
    public static void main(String[] args) {
        System.out.println(floorSqrt(99));
    }
    public static long floorSqrt(long n) {

        // find the square root otherwise return the floor value
        // given ek number hai
        // binary search krna hai
        // binary search ka mtlb kya -->

        long low = 1;
        long high = n;

        while (high >= low) {

            // define mid
            long mid = (low + high) / 2;
            long val = mid * mid;

            // conditions
            if (val <= n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;


    }
}
