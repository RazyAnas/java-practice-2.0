package LeetCodeSolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumbers {

    public static void main(String[] args) {
        System.out.println(isHappy(99));
    }
    public static boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        return isHappyHelper(n, visited);
    }

    private static boolean isHappyHelper(int n, Set<Integer> visited) {
        if (n == 1) return true;
        if (visited.contains(n)) return false; // cycle detected
        visited.add(n);

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }

        return isHappyHelper(sum, visited);
    }
}
