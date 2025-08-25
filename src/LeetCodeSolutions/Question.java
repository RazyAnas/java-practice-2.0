package LeetCodeSolutions;

import java.util.*;

public class Question {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        // we need to find the minimum from a list

        int first = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < first) { 
                first = list.get(i);
            }
        }
        System.out.println(first);

    }



}
