package LeetCodeSolutions;

import java.util.Arrays;

public class minDaysToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        // edge case: not enough flowers
        if ((long) m * k > bloomDay.length) return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        int minDays = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, m, k, mid)) {
                minDays = mid;
                high = mid - 1;     // try smaller days
            } else {
                low = mid + 1;      // need more days
            }
        }

        return minDays;
    }
    public static boolean possible(int[] array, int m, int k, int n) {
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n) {  // bloomed
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }
}
