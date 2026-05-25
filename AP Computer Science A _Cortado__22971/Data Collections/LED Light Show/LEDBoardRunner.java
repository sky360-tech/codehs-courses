public class LEDBoardRunner
{
    public static void main(String[] args)
    {
        // Create a new 6x6 LED board
        int[][] myBoard = new int[6][6];

        // Set to horizontal stripes and print
        System.out.println("Horizontal Stripes:");
        LEDBoardControl.horizontalStripes(myBoard);
        LEDBoardControl.printBoard(myBoard);

        // Set to vertical stripes and print
        System.out.println("Vertical Stripes:");
        LEDBoardControl.verticalStripes(myBoard);
        LEDBoardControl.printBoard(myBoard);
    }
}