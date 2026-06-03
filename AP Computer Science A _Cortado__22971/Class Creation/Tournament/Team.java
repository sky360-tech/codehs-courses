public class Team {
    // Class variables
    private static int totalTeams = 0;
    private static final int MIN_TEAMS = 6;

    // Instance variable
    private String name;

    // Constructor
    public Team(String teamName) {
        this.name = teamName;
        totalTeams++;
    }

    // Class method to check if the tournament can start
    public static boolean tournamentReady() {
        return totalTeams >= MIN_TEAMS;
    }

    // Class method to get the total team count
    public static int getTotalTeams() {
        return totalTeams;
    }

    // Instance method to get the team's name
    public String getName() {
        return name;
    }
}// reviewed: 2026-06-03
