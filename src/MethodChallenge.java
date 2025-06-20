public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Anas Razy", calculateHighScorePosition(1500));
        displayHighScorePosition("Sana Khan", calculateHighScorePosition(1000));
        displayHighScorePosition("Pinki Shetty", calculateHighScorePosition(500));
        displayHighScorePosition("Mozerella Cheezangi", calculateHighScorePosition(100));
        displayHighScorePosition("Oily Singh", calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+" managed to get into position "+playerPosition+" on the High Score List.");
    }
    public static int calculateHighScorePosition(int playerScore){
        int playerPosition = 0;
        if (playerScore >= 1000){
            playerPosition = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            playerPosition = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            playerPosition = 3;
        } else {
            playerPosition = 4;
        }
        return playerPosition;
    }
}
