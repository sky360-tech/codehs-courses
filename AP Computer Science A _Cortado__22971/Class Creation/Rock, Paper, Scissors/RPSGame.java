public class RPSGame {
    // Class variables to track stats across all game sessions
    private static int totalGamesPlayed = 0;
    private static int totalUserGameWins = 0;
    private static int totalComputerGameWins = 0;

    // Instance variables for a single game session
    private int userRoundWins;
    private int computerRoundWins;
    private int roundsNeededToWin;

    /**
     * Constructor: Initializes a new game session.
     * Increments the total games played across the program.
     */
    public RPSGame(int roundsToWin) {
        this.roundsNeededToWin = roundsToWin;
        this.userRoundWins = 0;
        this.computerRoundWins = 0;
        totalGamesPlayed++;
    }

    /**
     * Plays one round, updates round wins, and returns the result message.
     */
    public String playRound(String userChoice) {
        String computerChoice = getRandomChoice();
        System.out.println("Computer chose: " + computerChoice);

        String winner = determineRoundWinner(userChoice, computerChoice);

        if (winner.equals("user")) {
            userRoundWins++;
            return "User wins this round!";
        } else if (winner.equals("computer")) {
            computerRoundWins++;
            return "Computer wins this round!";
        } else {
            return "It's a tie!";
        }
    }

    /**
     * Logic to determine winner based on Rock, Paper, Scissors rules.
     */
    public String determineRoundWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "tie";
        }
        
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    /**
     * Checks if either player has reached the win threshold.
     */
    public boolean hasGameWinner() {
        return userRoundWins >= roundsNeededToWin || computerRoundWins >= roundsNeededToWin;
    }

    /**
     * Finalizes the game winner and updates global win statistics.
     */
    public String getGameWinnerMessage() {
        if (userRoundWins >= roundsNeededToWin) {
            totalUserGameWins++;
            return "Congratulations! You won the game!";
        } else {
            totalComputerGameWins++;
            return "Game over! The computer wins.";
        }
    }

    /**
     * Displays the current score within the active game session.
     */
    public void printCurrentGameScore() {
        System.out.println("Current Game Score - User: " + userRoundWins + " | Computer: " + computerRoundWins);
    }

    /**
     * Class method to generate a random choice for the computer.
     * Uses Randomizer class (assumed available in your environment).
     */
    public static String getRandomChoice() {
        // Randomizer.nextInt(min, max) 
        int choice = Randomizer.nextInt(0, 2);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    /**
     * Class method to print the final statistics across all sessions.
     */
    public static void printOverallStats() {
        System.out.println("Overall Game Statistics:");
        System.out.println("Total Games Played: " + totalGamesPlayed);
        System.out.println("User Game Wins: " + totalUserGameWins);
        System.out.println("Computer Game Wins: " + totalComputerGameWins);
    }
}// reviewed: 2026-06-02
