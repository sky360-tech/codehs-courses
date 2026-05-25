public class RectangleRunner 
{
    // Main method to test the isSquare method
    public static void main(String[] args) 
    {
        // Create Rectangle objects
        Rectangle rectangle1 = new Rectangle(5, 5);
        Rectangle rectangle2 = new Rectangle(5, 7);

        // Test the isSquare method
        System.out.print("Is rectangle1 a square? ");
        rectangle1.isSquare();
        System.out.println();

        System.out.print("Is rectangle2 a square? ");
        rectangle2.isSquare();
        System.out.println();
    }
}