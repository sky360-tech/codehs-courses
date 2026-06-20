import java.util.Scanner;

public class CityBuses
{
    public static void main(String[] args)
    {
        // Check a user for a possible discount
        checkForDiscount();
    }

    // Asks a user for information and then verifies if they
    // qualify for a discount or not
    public static void checkForDiscount()
    {
        Scanner input = new Scanner(System.in);
        
        // Ask user if they are a student
        System.out.println("Are you a student (true/false)? ");
        boolean isStudent = input.nextBoolean();
        
        // Ask for their age
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        // Check conditions for discount
        if (age > 60) 
        {
            System.out.println("You qualify for the discount!");
        } 
        else 
        {
            if (isStudent) 
            {
                System.out.println("You qualify for the discount!");
            } 
            else 
            {
                System.out.println("You do not qualify for the discount.");
            }
        }
    }
}// reviewed: 2026-06-20
