public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(58));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int i = 0;
        while (number>9){
            i = number%10; //this will return last digit;
            number /= 10;
        }
        sum = i + number;
        return sum;
    }
}
