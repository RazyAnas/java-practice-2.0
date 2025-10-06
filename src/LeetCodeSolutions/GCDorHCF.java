package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(findGcd(20, 15));
    }
    // Given two integers N1 and N2, find their greatest common divisor
    // The Greatest Common Divisor of any two integers is the largest number that divides both integers.
    public static int findGcd(int n1, int n2) {
        // first we need to find the factorials of the n1 and n2 and then take out common and multiply that
        // brute force method
        // Factors = numbers that divide another number exactly (no remainder)
//
//        ArrayList<Integer> f1 = new ArrayList<>();
//        ArrayList<Integer> f2 = new ArrayList<>();
//        // factors of n1
//        for (int i = 1; i <= n1; i++) {
//            if (n1 % i == 0) f1.add(i);
//        }
//
//        // factors of n2
//        for (int i = 1; i <= n2; i++) {
//            if (n2 % i == 0) f2.add(i);
//        }
//
//        // find common factors
//        Set<Integer> set1 = new HashSet<>(f1);
//        int gcd = 1; // smallest gcd is always 1
//        for (int num : f2) {
//            if (set1.contains(num)) {
//                gcd = Math.max(gcd, num); // pick the largest common factor
//            }
//        }
//        return gcd;


        // method 2: Euclidean method:
        // divide the larger with smaller number --> remainder --> divide the divisor with remainder until u get 0 as remainder
        if (n1 < n2) return findGcd(n2, n1);
        if (n2 == 0) return n1;
        // n1 is large
        if (n1 % n2 == 0) return n2;
        else return findGcd(n2 , n1 % n2);

    }

}
