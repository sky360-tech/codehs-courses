import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for three integers
        System.out.println("Enter the first integer:");
        int first = input.nextInt();
        
        System.out.println("Enter the second integer:");
        int second = input.nextInt();
        
        System.out.println("Enter the third integer:");
        int third = input.nextInt();
        
        // Call the findMedian method and print the result
        int median = findMedian(first, second, third);
        System.out.println("\nThe median is " + median);
    }

    // Method to find the median of three numbers
    public static int findMedian(int a, int b, int c)
    {
    // Check if 'a' is the median
    if ((a >= b && a <= c) || (a >= c && a <= b)) 
    {
        return a;
    }
    // Check if 'b' is the median
    else if ((b >= a && b <= c) || (b >= c && b <= a)) 
    {
        return b;
    }
    // If neither 'a' nor 'b' is the median, 'c' must be it
    else 
    {
        return c;
    }
}

}// reviewed: 2026-06-22
