package LeetCodeSolutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int n) {
        BigInteger answer = BigInteger.valueOf(1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= n; i++) {
//            answer = answer * (n - i + 1) / i;
//            row.add(answer);
        }
        return row;
    }
}
