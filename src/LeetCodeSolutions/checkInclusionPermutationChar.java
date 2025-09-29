package LeetCodeSolutions;

public class checkInclusionPermutationChar {

    public boolean checkInclusion(String s1, String s2) {
        // what we need to do:
        // store the s1 string in hashmap
        // remember that we have these characters
        // we can do this using array char - 'A' thing
        // get two pointers/sliding window
        // window will work on s2
        // both arrows at initial
        // is the char appearing in s1? --> no move both arrow forward
        // is the arrow appearing in s1? --> yes, move right arrow to forward
        // move upto the lenght of s1
        int n = s2.length();
        int[] freq = new int[26];

        // Step 1: fill frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int left = 0, right = 0;

        // Step 2: sliding window over s2
        while (right < n) {
            char c = s2.charAt(right);

            // If this char is available in freq
            if (freq[c - 'a'] > 0) {
                freq[c - 'a']--;   // use it
                right++;           // move forward
            } else {
                // mismatch → restore left char
                freq[s2.charAt(left) - 'a']++;
                left++;            // shrink window
            }

            // If window size == s1 length → match found
            if (right - left == s1.length()) {
                return true;
            }
        }

        return false;
    }
}
