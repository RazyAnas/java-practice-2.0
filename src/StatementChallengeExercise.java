public class StatementChallengeExercise {
    public static void main(String[] args) {
//        System.out.println(isPrime(3));
        int count = 0;
        for (int wholeNumber = 0; wholeNumber < 50; wholeNumber++){
            if (isPrime(wholeNumber)){
                count++;
                if (count == 3){
                    break;
                }
            }
        }
        System.out.println(count);
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
