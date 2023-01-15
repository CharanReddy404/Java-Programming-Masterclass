public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Charan",500);
        System.out.println("New score is "+ newScore);

        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No players");
        return 0;
    }

}