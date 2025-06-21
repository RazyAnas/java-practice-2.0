public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number){
        // negative number is invalid
        if (number < 0){
            return -1;
        }
        int sum = 0;
        // sum of each digit of the number for ex: number = 1234 then sum = 1+2+3+4=10
        while (number > 9){
            sum += (number%10);
            number /= 10;
        }
        // adding each number
        sum += number;
        return sum;
    }

}
