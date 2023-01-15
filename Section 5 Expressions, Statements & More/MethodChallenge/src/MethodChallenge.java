public class MethodChallenge {
    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Charan1",highScore);
        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Charan2",highScore);
        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Charan3",highScore);
        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Charan4",highScore);
        highScore = calculateHighScorePosition(25);
        displayHighScorePosition("Charan5",highScore);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        } else if (score>=500) {
            return 2;
        } else if (score>=100) {
            return 3;
        }
        return 4;
    }
}