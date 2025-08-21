package LeetCodeSolutions;

public class AddBinary {

    public static void main(String[] args) {
        String sum = String.valueOf(addBinary("100", "111"));
        System.out.println(sum);
    }

    public static String addBinary(String a, String b) {

        // we have strings a and b we want 1 digit from left at a time as binary.
        int i = a.length() - 1; // pointer for a
        int j = b.length() - 1; // pointer for b

        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int A = (i >= 0) ? a.charAt(i) - '0' : 0; // get binary digit or 0
            int B = (j >= 0) ? b.charAt(j) - '0' : 0;

            // Generate & Propagate
            int Gi = A & B;
            int Pi = A ^ B;

            // Sum bit
            int Si = Pi ^ carry;

            // Carry update
            carry = Gi | (Pi & carry);

            result.append(Si);

            i--;
            j--;
        }

        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
