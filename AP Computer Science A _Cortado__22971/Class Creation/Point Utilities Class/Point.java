// This class is complete and doesn't need to be updated

public class Point 
{
    private int x;
    private int y;

    public Point(int x1, int y1) 
    {
        x = x1;
        y = y1;
    }

    public int getX() 
    {
        return x;
    }

    public void setX(int x2) 
    {
        x = x2;
    }

    public int getY() 
    {
        return y;
    }

    public void setY(int y2) 
    {
        y = y2;
    }

    public String toString() 
    {
        return "[" + x + ", " + y + "]";
    }
}// reviewed: 2026-06-01
