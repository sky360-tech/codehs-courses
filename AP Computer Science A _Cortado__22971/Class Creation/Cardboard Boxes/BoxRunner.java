public class BoxRunner
{
    public static void main(String[] args)
    {
        Box box1 = new Box(10, 3, 5);
        Box box2 = new Box(8, 6, 4);
        
        Box largerBox = box1.getLargerBox(box2);
        System.out.println("The larger volume box has the " + 
            "following dimensions:\n\n" + largerBox);
    }
}// reviewed: 2026-05-27
