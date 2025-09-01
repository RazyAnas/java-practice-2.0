package LeetCodeSolutions;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

    }

        public int[] topKFrequent(int[] nums, int k) {

            Map<Integer, Integer> numsFrequency = new HashMap<>();

            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));

            // we need to create a hashmap to store number vs no. of times it came in sorted with natural order --> key

            // if k = 1 we gotta get first value
            // if k = 2 we gotta get first value and second value and so on..

            for (var num : nums) {
                numsFrequency.put(num, numsFrequency.getOrDefault(num, 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(numsFrequency.entrySet());

            // Sort by frequency descending
            entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            int[] topKKeys = new int[k];
            for (int i = 0; i < k; i++) {
                topKKeys[i] = entries.get(i).getKey();
            }
            // Print the result
            System.out.println(topKKeys);
            return topKKeys;
        }

}
