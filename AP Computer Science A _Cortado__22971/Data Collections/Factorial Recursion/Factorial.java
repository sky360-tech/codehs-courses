public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }
    
    public static int factorial(int x)
    {
        // Base case
        if (x <= 1)
        {
            return 1;
        }
        
        // Recursive statement
        return x * factorial(x - 1);
    }

}// reviewed: 2026-06-11
