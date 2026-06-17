public class TicTacToe
{
    // Declare instance variables
    private String[][] board;
    private int turn;
    
    // Constructor that initializes the empty game board
    public TicTacToe()
    {
        // Initialize turn to 0
        turn = 0;
        // Allocate space for a 3x3 array
        board = new String[3][3];
        // Fill the board with "-"
        for (int r = 0; r < 3; r++)
        {
            for (int c = 0; c < 3; c++)
            {
                board[r][c] = "-";
            }
        }
    }
    
    // Returns true if row and col is a valid, empty space
    public boolean pickLocation(int row, int col)
    {
        // Check if row and col are within 0-2 and if the spot is "-"
        if (row >= 0 && row < 3 && col >= 0 && col < 3)
        {
            return board[row][col].equals("-");
        }
        return false;
    }

    // Places an X or O at location (row, col) based on the turn value
    public void takeTurn(int row, int col)
    {
        if (turn % 2 == 0)
        {
            board[row][col] = "X";
        }
        else
        {
            board[row][col] = "O";
        }
        turn++;
    }
    
    // Returns the current turn
    public int getTurn()
    {
        return turn;
    }

    // Returns true if a single row has three X or O's
    public boolean checkRow()
    {
        for (int r = 0; r < 3; r++)
        {
            if (!board[r][0].equals("-") && 
                 board[r][0].equals(board[r][1]) && 
                 board[r][1].equals(board[r][2]))
            {
                return true;
            }
        }
        return false;
    }
    
    // Returns true if a single column has three X or O's
    public boolean checkCol()
    {
        for (int c = 0; c < 3; c++)
        {
            if (!board[0][c].equals("-") && 
                 board[0][c].equals(board[1][c]) && 
                 board[1][c].equals(board[2][c]))
            {
                return true;
            }
        }
        return false;
    }

    // Returns true if a diagonal has three X or O's
    public boolean checkDiag()
    {
        // Check top-left to bottom-right
        if (!board[0][0].equals("-") && 
             board[0][0].equals(board[1][1]) && 
             board[1][1].equals(board[2][2]))
        {
            return true;
        }
        // Check top-right to bottom-left
        if (!board[0][2].equals("-") && 
             board[0][2].equals(board[1][1]) && 
             board[1][1].equals(board[2][0]))
        {
            return true;
        }
        return false;
    }

    // Returns true if the turn count is less than the max (9)
    public boolean checkTurn()
    {
        return turn < 9;
    }
    
    // Returns true if someone has won the game
    public boolean checkWin()
    {
        return checkRow() || checkCol() || checkDiag();
    }

    // Prints out the board array on to the console
    public void printBoard()
    {
        System.out.println("  0 1 2");
        for (int r = 0; r < 3; r++)
        {
            System.out.print(r + " ");
            for (int c = 0; c < 3; c++)
            {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}// reviewed: 2026-06-17
