public class Rectangle 
{
    // Instance variables
    private int width;
    private int height;

    // Constructor to initialize the rectangle's dimensions
    public Rectangle(int w, int h) 
    {
        width = w;
        height = h;
    }

    // Method to check if the rectangle is a square
// Method to check if the rectangle is a square
    public void isSquare() 
    {
        // Use an if-else statement to check if width and height are equal
        if (width == height) 
        {
            // Use println to ensure the cursor moves to the next line
            System.out.println("This rectangle is a square.");
        } 
        else 
        {
            // Use println for the negative case as well
            System.out.println("This rectangle is not a square.");
        }
    }
}