package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(climbStairs(47));
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return fibo(n+1,memo);
    }

    public static int fibo(int n, Map<Integer, Integer> memo){
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int val = fibo(n-1, memo) + fibo(n-2, memo);
        memo.put(n, val);
        return val;
    }

}
