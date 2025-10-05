package LeetCodeSolutions;

public class ReverseNumber {
    public int reverse(int x) {
        long result = 0;

        int sign = (x < 0) ? -1 : 1; // sign = -1 if negative, else +1
        x = Math.abs(x);

        while (x > 0) {

            int mod = x % 10;
            result = result * 10 + mod;
            x = x / 10;
        }

        result = sign * result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}
