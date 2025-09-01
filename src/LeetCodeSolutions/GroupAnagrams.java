package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        // How to group each List<String>:
        // 1. what is an anagram
        // 2. string ka length same
        // 3. each character and its count same

        // String[] sortedArray = new String[strs.length];
        // for (int i = 0; i < strs.length; i++) {
        //     char[] chars = strs[i].toCharArray();
        //     Arrays.sort(chars);
        //     sortedArray[i] = new String(chars);
        // }
        // Map<String, List<String>> map = new HashMap<>();

        // for (int j = 0; j < sortedArray.length; j++) {
        //     String key = sortedArray[j];
        //     String original = strs[j];

        //     if (!map.containsKey(key)) {
        //         map.put(key, new ArrayList<>());
        //     }
        //     map.get(key).add(original);
        // }
        // return new ArrayList<>(map.values());


        HashMap<String, List<String>> map = new HashMap();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

}
