public class Summing 
{  
    public static void main(String[] args) 
    {
        // Call the recursive sum method and print the final output
    	System.out.println(sum(5));
    }
    
    // Returns the sum of all the numbers from 0 up to the parameter n
    public static int sum(int n)
    {
    	if (n == 0)
    	{
    	    return 0;
    	}
    
    	return n + sum(n - 1);
    }
}// reviewed: 2026-06-16
