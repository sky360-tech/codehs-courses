public class TeamTester {
    public static void main(String[] args) {
        // Create some teams
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        Team team4 = new Team();
        Team team5 = new Team();
        Team team6 = new Team();

        // Check if the tournament is ready
        System.out.println("Total Teams: " + Team.totalTeams);
        System.out.println("Is the tournament ready? " + Team.tournamentReady());
    }
}// reviewed: 2026-08-12
