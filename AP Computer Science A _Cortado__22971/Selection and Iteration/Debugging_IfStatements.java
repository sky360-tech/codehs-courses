import java.util.Scanner;

public class DebugIfStatements 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0); 
        {
            System.out.println("The number is positive.");
        }

        // Check if the number is negative
        if (number < 0);
        {
            System.out.println("The number is negative.");
        }

        System.out.println("Program finished!");
    }
}