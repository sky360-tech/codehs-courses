public class MethodParts
{
    public static void main(String[] args)
    {
        int count = 25;
        System.out.println(whatAmI(count));
        System.out.println(count);
    }

    public static int whatAmI(int myNum)
    {
        myNum += 100;
        return myNum;
    }
}// reviewed: 2026-07-05
