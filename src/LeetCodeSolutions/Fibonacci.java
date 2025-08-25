package LeetCodeSolutions;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static int fib(int n) {


        // base condition
        if (n == 0 || n == 1) return n;

        // check if we already have its fibo
        if (map.get(n) != null) {
            return map.get(n);
        }

        int fibo = fib(n-1) + fib(n-2);
        map.put(n, fibo);
        return fibo;

    }
}
