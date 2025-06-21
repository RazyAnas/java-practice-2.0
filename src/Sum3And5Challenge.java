public class Sum3And5Challenge {
    public static void main(String[] args) {
        // 1 to 1000 inclusive for loop
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){

            // if statement to find all numbers divisible by both 3 and 5
            if (i%3==0 && i%5==0){
                sum += i;
                count++;
                System.out.println(i);

            }
            if (count == 5){
                break;
            }

        }
        System.out.println(sum);
    }
}
