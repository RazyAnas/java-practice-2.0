package LeetCodeSolutions;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];        // counts for 'A'..'Z'
        int left = 0, right = 0, maxFreq = 0, ans = 0;

        while (right < s.length()) {
            int idxR = s.charAt(right) - 'A';   // map char to 0..25
            freq[idxR]++; // we found that same character
            maxFreq = Math.max(maxFreq, freq[idxR]);  // get max freq of any char

            // shrink window while changes needed > k
            // we dont need while loop
            // (right - left + 1) == length of substring
            // substring - maxFreq = no. of conversions needed
            // if conversion more than that can be converted (k)
            // move the left pointer to ahead
            if ((right - left + 1) - maxFreq > k) {
                int idxL = s.charAt(left) - 'A';
                freq[idxL]--; // since we moved one pointer ahead subtract one from the frequency of that character
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
