public class StatementChallengeExercise {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    public static boolean isPrime(int num){
        if (num <= 2){
            return (num == 2);
        }

        for (int divisor = 2; divisor <= num/2; divisor++){
            if (num%divisor==0){
                return false;
            }
        }

        return true;
    }
}
