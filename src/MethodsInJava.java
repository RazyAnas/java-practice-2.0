public class MethodsInJava {
    // void datatype means no data will be returned
    public static void main(String[] args) {
        // Learning Method

//        int levelCompleted = 5;
//        int bonus = 200;
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10_000, 8,200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score =  800;
//        int levelCompleted = 5;
//        int bonus = 200;
        int finalScore = score;
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score was "+ finalScore);
        }
    }
}
