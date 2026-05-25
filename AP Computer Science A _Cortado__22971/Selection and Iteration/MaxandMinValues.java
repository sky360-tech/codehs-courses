import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Initialize max and min to the extremes so the first input 
        // will always replace them.
        int max = Integer.MIN_VALUE; // The smallest possible integer
        int min = Integer.MAX_VALUE; // The largest possible integer
        
        while (true)
        {
            System.out.println("Enter a number or 0 to quit: ");
            int current = input.nextInt();
            
            // Check for the sentinel value to break the loop
            if (current == 0)
            {
                break;
            }
            
            // Update max if the new number is larger
            if (current > max)
            {
                max = current;
            }
            
            // Update min if the new number is smaller
            if (current < min)
            {
                min = current;
            }
            
            // Print results so far
            System.out.println("Results so far:");
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
        }
    }
}