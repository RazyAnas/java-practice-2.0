package LeetCodeSolutions;

public class Atoi {
    public int myAtoi(String s) {

        // given:
        // whitespace --> ignore
        // signedness = determine the sign by checking if the next character is - or + if neither = +
        // conversion --> read the integer by skipping leading zeroes until a non digit character is there
        // or if end is reached
        // if no digits read result is 0
        // if integer is out of range of 32-bit integer  round it to Integer.MAX_VALUE or MIN_VALUE

        // if String is empty return 0
        if (s.isEmpty() || s == null) return 0;

        // initialize index, sign and result:
        int i = 0, sign = 1; // where i is the index
        long result = 0L;

        while (i < s.length() && s.charAt(i) == ' ') i++;
        if (i == s.length()) return 0;
        // check for optional +/-
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            sign = +1;
            i++;
        }
        // keep converting string to number upto valid numbers:
        while ((i < s.length() && Character.isDigit(s.charAt(i)))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)(sign * result);
    }
}
