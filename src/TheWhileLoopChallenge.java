public class TheWhileLoopChallenge {
    public static void main(String[] args) {
//        System.out.println(isEvenNumber(2));
//        for (int i = 5; i <= 20; i++){
//            if (isEvenNumber(i)){
//                System.out.println(i);
//            }
//        }

        int i = 5;
        int countEven = 0;
        int countOdd = 0;
        while (i <= 20){
            if (isEvenNumber(i)){
                System.out.println(i+" is an Even number.");
                countEven++;
                if (countEven==5){
                    break;
                }
            }else {
                countOdd++;
            }
            i++;
        }
        System.out.println("Total Even numbers found = "+countEven);
        System.out.println("Total Odd numbers found = "+countOdd);
    }
    public static boolean isEvenNumber(int number){
        if (number > 1 && number%2==0){
            return true;
        }
        return false;
    }
}
