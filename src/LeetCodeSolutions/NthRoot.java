package LeetCodeSolutions;

public class NthRoot {
    public static void main(String[] args) {
        System.out.println(NthRoot(3, 27)); // should print 3
    }

    public static long NthRoot(long n, long m) {
        long low = 1, high = m; // search space: 1 to m
        while (high >= low) {
            long mid = (high + low) / 2;
            long check = func(mid, n, m); // compare mid^n with m

            if (check == 1) return mid;   // exact root
            else if (check == 0) low = mid + 1; // mid^n < m
            else high = mid - 1;                // mid^n > m
        }
        return -1; // if no integer root exists
    }

    // func returns:
    // 1 → mid^n == m
    // 0 → mid^n < m
    // 2 → mid^n > m
    public static long func(long mid, long n, long m) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * mid;
            if (answer > m) return 2; // too large
        }
        if (answer == m) return 1; // exact
        else return 0; // too small
    }
}
