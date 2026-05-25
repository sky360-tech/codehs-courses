import java.util.ArrayList;

public class FantasyFootballTeam {
    private ArrayList<String> team; 
    private ArrayList<String> availablePlayers; 
    public static final int MAX_TEAM_SIZE = 5; 

    public FantasyFootballTeam() {
        team = new ArrayList<String>();
        availablePlayers = new ArrayList<String>();
        
        availablePlayers.add("Josh Allen");
        availablePlayers.add("Jonathan Taylor");
        availablePlayers.add("Breece Hall");
        availablePlayers.add("Patrick Mahomes");
        availablePlayers.add("Saquon Barkley");
        availablePlayers.add("CeeDee Lamb");
        availablePlayers.add("AJ Brown");
        availablePlayers.add("Travis Kelce");
        availablePlayers.add("Baker Mayfield");
        availablePlayers.add("Marvin Harrison Jr.");
        availablePlayers.add("Justin Jefferson");
        availablePlayers.add("Jahmyr Gibbs");
        availablePlayers.add("Alvin Kamara");
        availablePlayers.add("Mike Evans");
        availablePlayers.add("Aaron Rodgers");
    }

    // Returns the index of an available player or -1 if the player is not available
    public int checkAvailability(String player) {
        for (int i = 0; i < availablePlayers.size(); i++) {
            if (availablePlayers.get(i).equals(player)) {
                return i; // Found the player
            }
        }
        return -1; // Player not found
    }

    // Add player to team if team is less than max team size and player is available
    public void addPlayer(String player) {
        // 1. Check if the team is full
        if (team.size() >= MAX_TEAM_SIZE) {
            System.out.println("Your team already has " + MAX_TEAM_SIZE + " players.");
        } 
        else {
            // 2. Check if player exists in availablePlayers
            int index = checkAvailability(player);
            
            if (index == -1) {
                System.out.println(player + " is not available.");
            } 
            else {
                // 3. Success: Add to team, remove from available, and notify user
                team.add(player);
                availablePlayers.remove(index);
                System.out.println("Successfully added " + player + ".");
            }
        }
    }

    public int getTeamLength() {
        return team.size();
    }

    public String toString() {
        String output = "";
        for (String player : team) {
            output += " * " + player + "\n";
        }
        return output;
    }
}