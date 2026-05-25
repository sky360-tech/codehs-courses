public class BaseballRunner
{
    public static void main(String[] args)
    {
        // Create object for Aaron Judge: 1205 hits, 4105 at-bats
        BaseballPlayer judge = new BaseballPlayer("Aaron Judge", 1205, 4105);

        // Print out player's batting average
        System.out.println(judge.toString());
        System.out.println("Career Batting Average: " + judge.battingAverage());
    }
}