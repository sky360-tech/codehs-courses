import java.util.Scanner;

public class Salmon 
{
    public static void main(String[] args) 
    {
        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for month and capture input
        System.out.println("Enter month of year as a number: ");
        int month = input.nextInt();
        
        // Months 1-7: Not spawning season
        if (month == 1) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 2) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 3) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 4) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 5) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 6) 
        {
            System.out.println("Not spawning season");
        } 
        else if (month == 7) 
        {
            System.out.println("Not spawning season");
        } 
        // Months 8-11: Spawning season
        else if (month == 8) 
        {
            System.out.println("Spawning season");
        } 
        else if (month == 9) 
        {
            System.out.println("Spawning season");
        } 
        else if (month == 10) 
        {
            System.out.println("Spawning season");
        } 
        else if (month == 11) 
        {
            System.out.println("Spawning season");
        } 
        // Month 12: Not spawning season
        else if (month == 12) 
        {
            System.out.println("Not spawning season");
        } 
        // Handle invalid input (less than 1 or greater than 12)
        else 
        {
            System.out.println("Invalid month.");
        }
    }
}