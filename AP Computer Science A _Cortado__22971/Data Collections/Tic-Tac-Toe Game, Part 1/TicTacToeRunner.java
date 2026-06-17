public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        // Create new board and print
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        // Plays three turns, each placing a mark on the first row
        for (int col = 0; col < 3; col++)
        {   
            // If location is available
            if (game.pickLocation(0, col))
            {
                // Put mark on first row spot
                game.takeTurn(0, col);
            }
        }
        System.out.println("After three turns:");
        game.printBoard();
    }
}// reviewed: 2026-06-17
