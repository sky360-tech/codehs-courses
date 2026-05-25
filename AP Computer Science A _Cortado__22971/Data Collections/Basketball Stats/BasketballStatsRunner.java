public class BasketballStatsRunner
{
    public static void main(String[] args)
    {
        // Create an array of Player objects using sample data
        Player[] players = {
            new Player("LeBron", "James", "39", "25.7", "7.3"),
            new Player("Stephen", "Curry", "36", "29.5", "6.1"),
            new Player("Nikola", "Jokić", "29", "26.4", ""),
            new Player("Kevin", "Durant", "35", "28.3", "7.4"),
            new Player("Jayson", "Tatum", "27", "", "8.1"),
            new Player("Luka", "Dončić", "25", "33.9", "")
        };

        // Print out each player's information
        for (Player player : players)
        {
            System.out.println(player);
        }

        // Print summary stats (average PPG and top scorer)
        Player.printOverallStats();
    }
}