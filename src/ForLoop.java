public class ForLoop {
    public static void main(String[] args) {
//
//        for (double interest = 2; interest<5; interest++){
//            double interestAmount =  calculateInterest(10000.0, interest);
//            System.out.println(interestAmount);
//        }

        // mini challenge
        for (double rate = 7.5; rate <= 10; rate += 0.25){
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println(interestAmount);
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
