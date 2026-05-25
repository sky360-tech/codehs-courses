public class TeamRunner
{
    public static void main(String[] args)
    {
        // Tracks the number of teams in the tournament
        int number = 1;
        
        // Keep creating new teams until there are enough teams for
        // the tournament to begin
        while(true)
        {
            // Creates a team
            String name = "Team " + number;
            Team opponent = new Team(name);
            System.out.println(opponent.getName());
            
            // Checks if there are enough teams
            if (Team.tournamentReady())
            {
                System.out.println("\nThe tournament is ready to begin!");
                break;
            }
            number++;
        }
        
        // Prints the total number of teams
        System.out.println("Number of teams: " + Team.getTotalTeams());
    }
}