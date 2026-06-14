public class Shifting
{
    public static void main(String[] args)
    {
        int[][] numArray = {
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30}
        };

        // shiftRight(numArray);
        // shiftDown(numArray);

        printArray(numArray);
    }

    public static void shiftRight(int[][] numbers)
    {
        for (int row = 0; row < numbers.length; row++)
        {
            // Last column index in the row
            int lastIndex = numbers[row].length - 1;
            // Temporarily stores the last value in the row
            int tempLastValue = numbers[row][lastIndex];
            
            // Starting with the last value in the row, set
            // it equal to the value to the left, effectively
            // shifting that left value one spot right
            for (int col = lastIndex; col > 0; col--)
            {
                numbers[row][col] = numbers[row][col - 1];
            }

            // Sets the first value with the previous last value
            numbers[row][0] = tempLastValue;
        }
    }

    public static void shiftLeft(int[][] numbers)
    {
        // Use shiftRight() as a guide to complete this
    }

    public static void shiftDown(int[][] numbers)
    {
        // Last row index in 2D array
        int lastIndex = numbers.length - 1;
        // Temporarily stores the last row
        int[] tempLastRow = numbers[lastIndex];
        
        // Starting with the last row, set it equal 
        // to the row above it, effectively shifting 
        // that row above one spot down
        for (int row = lastIndex; row > 0; row--)
        {
            numbers[row] = numbers[row - 1];
        }

        // Sets the first row with the previous last row
        numbers[0] = tempLastRow;
    }

    public static void shiftUp(int[][] numbers)
    {
        // Use shiftDown() as a guide to complete this
    }

    public static void printArray(int[][] numbers)
    {
        for (int[] row : numbers)
        {
            for (int num : row)
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}// reviewed: 2026-06-14
