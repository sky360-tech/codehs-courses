import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);     
        
        // Get user inputs
        System.out.println("How tall are you (in inches)?");
        int height = input.nextInt();
        
        System.out.println("How old are you (in years)?");
        int age = input.nextInt();
        
        // Use if statements to check if user is eligible to ride
        if (height >= 42) 
        {
            // Height requirement met, now check age logic
            if (age >= 9) 
            {
                System.out.println("Welcome aboard!");
            } 
            else 
            {
                // Under 9 years old but tall enough
                System.out.println("You need to be accompanied by an adult to ride.");
            }
        } 
        else 
        {
            // Did not meet the minimum height requirement
            System.out.println("Sorry, you are not eligible to ride.");
        }
    }
}// reviewed: 2026-06-23
