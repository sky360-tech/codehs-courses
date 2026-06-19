public class Rectangle
{
    // Instance variables
    private int width;
    private int height;

    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    // Method returns the width of the object
    public int getWidth()
    {
        return width;
    }

    // Method returns the height of the object
    public int getHeight()
    {
        return height;
    }

    // Method calculates and returns area of the object
    public int calcArea()
    {
        return width * height;
    }

    // Method calculates and returns perimeter of the object
    public int calcPerimeter()
    {
        return 2 * width + 2 * height;
    }

    // Two rectangles are equal if they have the same attributes
    public boolean equals(Rectangle other)
    {
        return other != null && 
        other.getWidth() == width &&
        other.getHeight() == height;
    }
}// reviewed: 2026-06-19
