public class Team {
    public static int totalTeams = 0;  // Tracks the total number of teams created
    public static int minTeams = 6;   // Minimum number of teams for a tournament

    public Team() {
        totalTeams++; // Increment totalTeams whenever a new Team is created
    }

    public static boolean tournamentReady() {
        return totalTeams >= minTeams; // Check if enough teams are created for a tournament
    }
}