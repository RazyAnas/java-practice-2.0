package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {

        // store arr in hashtable
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            table.put(arr[i], i);
        }

        // find largest value using Collections.max()
        int largestInt = Collections.max(table.values());
        // find lowest value using Collections.min()
        int smallestInt = Collections.min(table.values());

        for (int i = smallestInt; i <= largestInt; i++) {
            if (!table.containsKey(i)) {
                return i;
            }
        }

        return largestInt + 1;
    }
}
