import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for three ints and 
        // print out the median.
        System.out.println("Enter the first integer: ");
        
        int first = scanner.nextInt();
        
        System.out.println("Enter the second integer: ");
        
        int second = scanner.nextInt();
        
        System.out.println("Enter the third integer: ");
        
        int third = scanner.nextInt();
        
        int median = 0;
        
        if(first > second && first < third)
        {
            median = first;
        }
        else if(second > first && second < third)
        {
            median = second;
        }
        else if(third > first && third < second)
        {
            median = third;
        }
        else if(first == second && second > third)
        {
            median = third;
        }
        else if(first == second && first == third)
        {
            median = first;
        }
        else if(first == second && first < third)
        {
            median = first;
        }
         System.out.println("The median is " + median);
    }
}