public class Main {

    public static void main(String[] args) {

        Team<FootballPlayer> silverEagle = new Team<>("Silver Eagle");
        FootballPlayer charan = new FootballPlayer("charan");
        silverEagle.addPlayer(charan);

        Team<BaseballPlayer> blackBulls = new Team<>("Black Bulls");
        BaseballPlayer lucky = new BaseballPlayer("lucky");
        blackBulls.addPlayer(lucky);

        Team<SoccerPlayer> goldenDons = new Team<>("Golden Dons");
        SoccerPlayer Reddy = new SoccerPlayer("Reddy");
        goldenDons.addPlayer(Reddy);

        Team<FootballPlayer> silverEagleOne = new Team<>("silverEagleOne");
        Team<FootballPlayer> silverEagleTwo = new Team<>("silverEagleTwo");

        silverEagleOne.matchResult(silverEagle,2,1);
        silverEagleTwo.matchResult(silverEagleTwo,1,1);


//        ArrayList<Integer> items = new ArrayList<Integer>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
////        items.add("charan");
//        items.add(4);
//        items.add(5);
//
//        printDouble(items);
    }

//    private static void printDouble(ArrayList<Integer> n){
//        for (int i:n){
//            System.out.println((Integer)i*2);
//        }
//    }

}
