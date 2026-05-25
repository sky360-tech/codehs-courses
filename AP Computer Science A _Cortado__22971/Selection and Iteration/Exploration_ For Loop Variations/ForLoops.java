public class ForLoops 
{
    public static void main(String[] args) 
    {
        // Use this space to call each method after
        // you predict its output in Investigate.txt
        System.out.println("--- Loop 1 ---");
        loop1();
        System.out.println("--- Loop 2 ---");
        loop2();
        System.out.println("--- Loop 3 ---");
        loop3();
        System.out.println("--- Loop 4 ---");
        loop4();
        System.out.println("--- Loop 5 ---");
        loop5();
        
    }

    public static void loop1()
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(i);
        }
    }

    public static void loop2()
    {
        for (int i = 5; i > 1; i--) 
        {
            System.out.println(i);
        }
    }

    public static void loop3()
    {
        for (int i = 0; i < 10; i += 2) 
        {
            System.out.println(i);
        }
    }

    public static void loop4()
    {
        for (int i = 0; i <= 12; i *= 3) 
        {
            System.out.println(i);
        }
    }

    public static void loop5()
    {
        for (int i = 100; i > 1; i /= 5) 
        {
            System.out.println(i);
        }
    }
}