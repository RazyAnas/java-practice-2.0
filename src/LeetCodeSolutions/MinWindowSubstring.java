package LeetCodeSolutions;

import java.util.Arrays;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {


        // what we need to do?:
        // first we need memory to store all the characters --> done
        // then put two pointeres left and right --> done
        // keep moving the right pointer upto right <= n* --> done
        // if first element is not from the string t
        // move both and left and right by 1
        // else move right++ --> till we find all the characters from t
        // when all the characters are empty
        // store from left to right in a memory
        // so each time we find the character from the t remove one freq from
        // t storage
        // store the substirng from left to right last position
        // decide the length of the of the found substring
        // once all the Tfrq is covered --> move left by one position
        // again do the same thing
        // *this will keep happening until left <= n && right <= n --> done


        if (s.length() == 0 || t.length() == 0) return "";

        int[] freqT = new int[128];
        for (char c : t.toCharArray()) {
            freqT[c]++;
        }

        int[] temp = Arrays.copyOf(freqT, 128);
        int left = 0, minLength = Integer.MAX_VALUE, start = 0, right = 0;
        int count = t.length();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (freqT[c] > 0) {
                temp[c]--;
                if (temp[c] >= 0) count--;
            }

            while (count == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                if (freqT[leftChar] > 0) {
                    temp[leftChar]++;
                    if (temp[leftChar] > 0) count++;
                }
                left++;
            }
            right++;
        }

        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLength);
    }
}
