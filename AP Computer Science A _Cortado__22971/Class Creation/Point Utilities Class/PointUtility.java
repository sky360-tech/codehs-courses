public class PointUtility 
{
    // Increases parameter point's position by dx and dy
    public static void movePoint(Point point, int dx, int dy) 
    {
        // Add dx to current X and dy to current Y
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    // Reset point's position to origin (0,0)
    public static void resetPoint(Point point) 
    {
        // Hardcode both coordinates back to 0
        point.setX(0);
        point.setY(0);
    }
}