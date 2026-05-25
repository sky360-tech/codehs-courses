import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        
        System.out.println("Welcome to Tic-Tac-Toe!");
        
        // Loop runs while no one has won AND there are still turns left
        while (!game.checkWin() && game.checkTurn())
        {
            game.printBoard();
            
            System.out.print("Enter Your Row Pick: ");
            int row = input.nextInt();
            System.out.print("Enter Your Col Pick: ");
            int col = input.nextInt();
            System.out.println();
            
            // Validate the location
            if (game.pickLocation(row, col))
            {
                game.takeTurn(row, col);
            }
            else
            {
                System.out.println("That space is taken, or you entered an invalid row/col");
                System.out.println();
            }
        }
        
        // Final board print
        game.printBoard();
        
        // Determine the outcome
        if (game.checkWin())
        {
            // If the game ended and someone won, the person who 
            // JUST went (turn - 1) is the winner.
            // If turn is now odd, X just went. If even, O just went.
            if (game.getTurn() % 2 != 0)
            {
                System.out.println("X's Win!");
            }
            else
            {
                System.out.println("O's Win!");
            }
        }
        else
        {
            System.out.println("It's a tie!");
        }
    }
}