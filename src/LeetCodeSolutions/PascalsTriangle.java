package LeetCodeSolutions;



import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
        generate(4);
    }
    public static void generate(int n) {
        ArrayList<ArrayList<Long>> resultList = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            ArrayList<Long> row = new ArrayList<>();
            long answer = 1; // first element is always 1
            row.add(answer);

            for (int i = 1; i <= j; i++) {
                answer = answer * (j - i + 1) / i;
                row.add(answer);
            }
            resultList.add(row);
        }
        System.out.println(resultList);
    }

}
