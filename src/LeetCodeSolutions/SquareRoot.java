package LeetCodeSolutions;

import java.math.BigInteger;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(mySqrt(5));
    }

    public static int mySqrt(int n) {

        // Newton–Raphson method.
        if(n < Integer.MAX_VALUE) {
            // Newton–Raphson method.
            int x = n; // initial guess is the number itself
            int y = 1;

            double e = 0.0001; // let approximation be as close as this

            while (x-y > e) {
                x = (x + y) / 2;
                y = n / x;
            }
            return x;
        } else {
            BigInteger x = BigInteger.valueOf(n); // initial guess is the number itself
            BigInteger y = BigInteger.valueOf(1);

            double e = 0.0001; // let approximation be as close as this

            while (x.compareTo(y) > e) {
                x = x.add(y).divide(BigInteger.valueOf(2));
                y = BigInteger.valueOf(n).divide(x);
            }
            int w = Integer.parseInt(String.valueOf(x));
            return w;
        }
    }
}
