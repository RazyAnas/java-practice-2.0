public class MethodsInJava {
    public static void main(String[] args) {
        // Learning Method

        int levelCompleted = 5;
        int bonus = 200;
        calculateScore(true, 800, levelCompleted, bonus);

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
