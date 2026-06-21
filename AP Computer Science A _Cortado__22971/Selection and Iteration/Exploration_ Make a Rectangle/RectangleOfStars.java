public class RectangleOfStars
{
    public static void main(String[] args)
    {  
       // Call makeARectangle with 4 rows and 10 columns
       makeARectangle(4, 10);
    }
       
    // Updated method to accept row and column counts
    public static void makeARectangle(int numRows, int numCols)
    {
        // Use numRows to control the outer loop
       for (int row = 0; row < numRows; row++)
       {
           // Use numCols to control the inner loop
           for (int col = 0; col < numCols; col++)
           {
               System.out.print("* ");
           }
           // Move to the next line after each row is finished
           System.out.println();
       }
    }
}// reviewed: 2026-06-21
