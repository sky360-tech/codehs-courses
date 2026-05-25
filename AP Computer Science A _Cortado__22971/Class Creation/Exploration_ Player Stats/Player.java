public class Player {
    private static int totalPlayers = 0;
    private static int totalLevelUps = 0;

    private String username;
    private int highScore;
    private int level;

    public Player(String name, int score, int startingLevel) {
        username = name;
        highScore = score;
        level = startingLevel;
        totalPlayers++;
    }

    public void updateScore(int newScore) {
        if (newScore > highScore) {
            highScore = newScore;
        }
    }

    public void levelUp() {
        level++;
        totalLevelUps++;
    }

    public static Player findTopPlayer(Player p1, Player p2, Player p3) {
        Player top = p1;
        if (p2.getLevel() > top.getLevel()) top = p2;
        if (p3.getLevel() > top.getLevel()) top = p3;
        return top;
    }

    public static int getTotalPlayers()  { return totalPlayers; }
    public static int getTotalLevelUps() { return totalLevelUps; }

    public String getUsername() { return username; }
    public int getHighScore()   { return highScore; }
    public int getLevel()       { return level; }

    public String toString() {
        return username + " - Level: " + level + ", High Score: " + highScore;
    }
}