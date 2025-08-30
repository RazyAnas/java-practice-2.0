package LeetCodeSolutions;

public class ValidPalindrome {


    public boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while (i < j) {
            // skip non-alphanumeric
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            // compare lowercased chars
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        // String s = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println(s);
        // int i = 0;
        // int j = s.length()-1;

        // boolean flag = false;
        // if (s.length() == 0 || s.length() == 1) return true;
        // while (i < j) {
        //     if (s.charAt(i) == s.charAt(j)) {
        //         flag = true;
        //     } else {
        //         flag = false;
        //         break;
        //     }
        //     j--;
        //     i++;
        // }
        // return flag;

    }
}
