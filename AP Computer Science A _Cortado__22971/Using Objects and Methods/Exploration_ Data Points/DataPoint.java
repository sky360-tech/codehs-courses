public class DataPoint
{
    private int x;
    private int y;
    
    // Constructor with inputs
    public DataPoint(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    // Constructor with no inputs
    public DataPoint()
    {
        x = 0;
        y = 0;
    }

    // Gives the point new X and Y values
    public void set(int newX, int newY)
    {
        x = newX;
        y = newY;
    }

    // Adds dx and dy to current x and y values
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }

    // Calculates the distance from this data point to 
    // another set of coordinates
    public double distanceFrom(int x2, int y2)
    {
        return Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
    }
    
    // Defines the string that is printed for the object
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}// reviewed: 2026-06-30
