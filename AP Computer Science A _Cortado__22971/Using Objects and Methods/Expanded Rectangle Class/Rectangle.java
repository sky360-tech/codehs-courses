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

    // Method adds the parameter values to width and height
    public void grow(int wPlus, int hPlus)
    {
        width += wPlus;
        height += hPlus;
    }
    
    // Method subtracts the parameter values from width and height
    public void shrink(int wMinus, int hMinus)
    {
        width -= wMinus;
        height -= hMinus;
    }

    // Override default toString method with attribute info
    public String toString()
    {
        return "Width: " + width + "\nHeight: " + height;
    }
}