package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        ArrayList<Character> magChars = new ArrayList<>();
        for (int i = 0; i < magazine.length(); i++) {
            magChars.add(magazine.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!magChars.remove((Character) ransomNote.charAt(i))) { // remove one occurrence
                return false; // character not found
            }
            else {
                flag = false;
            }
        }
        return flag;

    }
}
