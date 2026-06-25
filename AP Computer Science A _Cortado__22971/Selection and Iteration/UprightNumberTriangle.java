public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
          makeNumberTriangle();

       
    }
    
    // Prints an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
    // Outer loop: controls the number of rows (1 through 5)
    for (int i = 1; i <= 5; i++) 
    {
        // Inner loop: prints numbers starting from 1 up to the current row number 'i'
        for (int j = 1; j <= i; j++) 
        {
            System.out.print(j + " ");
        }
        // Move to the next line after finishing the row
        System.out.println();
    }
    }

}// reviewed: 2026-06-25
