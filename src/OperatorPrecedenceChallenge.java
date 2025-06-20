public class OperatorPrecedenceChallenge {
    public static void main(String[] args) {
        double doubleVar = 20.00d;
        double doubleVar2 =  80.00d;
        double sum = (doubleVar2 + doubleVar)*100d;
        double remainder = sum % 33.00d;
        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println(isRemainderZero);
        if (!isRemainderZero){
            System.out.println("Got Some Remainder i.e " + remainder);
        }

    }
}
