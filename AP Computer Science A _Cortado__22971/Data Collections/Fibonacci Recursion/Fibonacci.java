public class Fibonacci
{
    public static void main(String[] args)
    {
        // The number of sequence numbers to be printed
        int count = 10;
        
        // Prints out "count" numbers of the sequence
        for (int i = 0; i <= count; i++)
        {
            System.out.println(fib(i));
        }
    }
    
    // Returns one number of the Fibonacci sequence; the 
    // parameter determines which number in the sequence.
    private static int fib(int x)
    {
        if (x == 0 || x == 1)
        {
            return x;
        }
        
        return fib(x - 1) + fib(x - 2);
    }
}