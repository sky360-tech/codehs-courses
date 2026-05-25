import java.util.Scanner;

public class RPSGameRunner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // This loop represents any number of games, with any number
        // of rounds per game.
        while (true)
        {
            // Determine the number of rounds in the game
            System.out.print("Enter number of rounds needed to win the game (or 0 to quit):");
            int roundsToWin = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Exit the game
            if (roundsToWin == 0)
            {
                break;
            }

            // Create game
            RPSGame game = new RPSGame(roundsToWin);

            // This loop is one game, ending when user or computer wins
            while (!game.hasGameWinner())
            {
                String userChoice = "";

                // This loop gets a value user choice of rock, paper, or scissors
                while (true)
                {
                    System.out.print("\nEnter your choice (rock, paper, or scissors):");
                    userChoice = scanner.nextLine().toLowerCase();

                    if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))
                    {
                        break;
                    }

                    System.out.println("Invalid input. Please try again.");
                }
                
                // Play one round with user's choice and print result
                String roundResult = game.playRound(userChoice);
                System.out.println(roundResult);

                // Print current game's score (ie number of rounds won_
                game.printCurrentGameScore();
            }

            // Once there is a winner, print winning message
            System.out.println("\n" + game.getGameWinnerMessage());

            // Ask user if they want to play another game
            System.out.println("\nDo you want to play another game? (yes/no):");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes"))
            {
                break;
            }
        }

        // Print the overall stats for all the games played
        RPSGame.printOverallStats();
        System.out.println("Thanks for playing!");
    }
}