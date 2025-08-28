package LeetCodeSolutions;

import java.util.*;

public class FirstUniqueChar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("nigger"));
    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> hashTable = new HashMap<>();

        // queue
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }

        // hashtable
        for (int i = 0; i < queue.size(); i++) {
            hashTable.put(queue.peek(), i);
        }

        int position = -1;
        while (!queue.isEmpty()) {
            if (hashTable.containsKey(queue.peek())) {
                queue.remove();
            } else {
                position = hashTable.get(queue.peek());
            }
        }

        return position;






//        // Brute Force
//        for (int i = 0; i < s.length(); i++) {
//
//            boolean isUnique = true;
//
//            for (int j = 0; j <s.length(); j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//
//            if (isUnique) {
//                return i;
//            }
//
//        }
//
//        return -1;
    }
}
