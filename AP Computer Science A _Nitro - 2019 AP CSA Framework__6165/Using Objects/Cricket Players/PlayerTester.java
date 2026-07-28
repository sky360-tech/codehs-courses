public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer one = new CricketPlayer("Sakib Al Hasan","Bangladesh");
       one.addMatch(26,13);
       one.addMatch(48,7);
       one.addMatch(20,9);
       one.addMatch(36,13);

       System.out.println("Sakib Al Hasan's Stats");
       one.printRunsScored();
       one.printBallsBowled();
       System.out.println(one);
       System.out.println();
       
       
       
       CricketPlayer two = new CricketPlayer("Virat");
       two.addMatch(37, 19);
       two.addMatch(26,13);
       two.addMatch(36,13);
       two.addMatch(26,3);
       System.out.println("Virat's Stats");
       two.printRunsScored();
       two.printBallsBowled();
       System.out.println(two);
    }
}// reviewed: 2026-07-28
