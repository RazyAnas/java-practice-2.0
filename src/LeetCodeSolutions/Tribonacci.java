package LeetCodeSolutions;

import java.util.HashMap;

public class Tribonacci {

    public static void main(String[] args) {

    }

    public static HashMap<Integer, Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if (n == 0 || n == 1) return n;
        if (n == 2) return n-1;

        // check if we already have its fibo
        if (map.get(n) != null) {
            return map.get(n);
        }

        // recursion
        int tribo = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        map.put(n, tribo);
        return tribo;
    }
}
