public class PointRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create a point and print it out
        Point myPoint = new Point(5, 10);
        System.out.println("Initial Point:");
        System.out.println(myPoint);

        // 2. Move the point and print again
        PointUtility.movePoint(myPoint, 3, 4);
        System.out.println("After moving:");
        System.out.println(myPoint);

        // 3. Reset the point and print again
        PointUtility.resetPoint(myPoint);
        System.out.println("After resetting:");
        System.out.println(myPoint);
    }
}// reviewed: 2026-06-02
