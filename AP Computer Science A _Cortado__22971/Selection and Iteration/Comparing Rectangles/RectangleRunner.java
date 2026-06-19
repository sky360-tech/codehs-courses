public class RectangleRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create two separate rectangle objects with same attributes
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(10, 20);

        // 2. Use == to see if their references are the same and print result
        System.out.println("Rect1 has the same reference as rect2: " + (rect1 == rect2));
        
        // 3. Print out each rectangle's individual string representation
        System.out.println("Rect1 representation: " + rect1);
        System.out.println("Rect2 representation: " + rect2);
        System.out.println(); // Added for spacing

        // 4. Use custom equals method to check to see if they are equivalent
        System.out.println("Rect1 is equivalent to rect2: " + rect1.equals(rect2));
        System.out.println(); // Added for spacing

        // 5. Create a third rectangle variable and set equal to second rectangle
        Rectangle rect3 = rect2;

        // 6. Check to see if 2nd and 3rd rectangles have same references and print
        System.out.println("Rect2 has the same reference as rect3: " + (rect2 == rect3));
        
        // 7. Print out 2nd and 3rd rectangle string representations
        System.out.println("Rect2 representation: " + rect2);
        System.out.println("Rect3 representation: " + rect3);
    }
}// reviewed: 2026-06-19
