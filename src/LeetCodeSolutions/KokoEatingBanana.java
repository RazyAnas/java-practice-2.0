package LeetCodeSolutions;

import java.util.Arrays;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = Arrays.stream(piles).max().getAsInt();

        while (low <= high) {
            long mid = low + ((high - low) >>> 1);
            long hours = neededHours(piles, mid);
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return Math.toIntExact(low);
    }

    private long neededHours(int[] piles, long k) {
        long total = 0;
        for (int x : piles) {
            total += (int) Math.ceil((double) x / k);
        }
        return total;
    }

}
