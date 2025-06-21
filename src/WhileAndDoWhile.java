public class WhileAndDoWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num < 50){
            num+=5;
            if (num%25==0){
                continue;
            }
            System.out.print(num+"_");

        }
    }
}
