public class LEDBoardControl
{
    // Creates alternating horizontal stripes: Even rows = 1, Odd rows = 0
    public static void horizontalStripes(int[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                // Check if the current row index is even
                if (row % 2 == 0)
                {
                    board[row][col] = 1;
                }
                else
                {
                    board[row][col] = 0;
                }
            }
        }
    }

    // Creates alternating vertical stripes: Even columns = 1, Odd columns = 0
    public static void verticalStripes(int[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                // Check if the current column index is even
                if (col % 2 == 0)
                {
                    board[row][col] = 1;
                }
                else
                {
                    board[row][col] = 0;
                }
            }
        }
    }

    public static void printBoard(int[][] board)
    {
        for (int[] row : board)
        {
            for (int led : row)
            {
                System.out.print(led + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}