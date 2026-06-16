public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}};
                        
        // Print out sum of 3rd row (index 2)
        int rowSum = sumRow(array, 2);
        System.out.println("The sum of the 3rd row is " + rowSum);
        
        // Print out sum of all elements
        int totalSum = sum2DArray(array);
        System.out.println("The sum of the 2D array's elements is " + totalSum);
    }
    
    // Returns the sum of a specific row in the 2D array
    public static int sumRow(int[][] array, int rowIndex)
    {
        int total = 0;
        // Traverse only the specified row
        for (int col = 0; col < array[rowIndex].length; col++)
        {
            total += array[rowIndex][col];
        }
        return total;
    }
    
    // Returns the sum of all elements in the entire 2D array
    public static int sum2DArray(int[][] array)
    {
        int total = 0;
        // Outer loop iterates through each row
        for (int row = 0; row < array.length; row++)
        {
            // Inner loop iterates through each column in the current row
            for (int col = 0; col < array[row].length; col++)
            {
                total += array[row][col];
            }
        }
        return total;
    }
}// reviewed: 2026-06-16
