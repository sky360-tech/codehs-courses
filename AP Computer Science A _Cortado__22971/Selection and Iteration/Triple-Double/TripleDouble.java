import java.util.Scanner;

public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // 1. Ask for and store input
        System.out.println("How many points did you score? ");
        int points = input.nextInt();
        
        System.out.println("How many rebounds did you get? ");
        int rebounds = input.nextInt();
        
        System.out.println("How many assists did you have? ");
        int assists = input.nextInt();
        
        // 2. Call methods and print results
        System.out.println("You got 10 or more points: " + hasPoints(points));
        System.out.println("You got 10 or more rebounds: " + hasRebounds(rebounds));
        System.out.println("You got 10 or more assists: " + hasAssists(assists));
    }
    
    // Each method evaluates the condition and returns the boolean result
    public static boolean hasPoints(int points) 
    {
        return points >= 10;
    }
    
    public static boolean hasRebounds(int rebounds) 
    {
        return rebounds >= 10;
    }
    
    public static boolean hasAssists(int assists) 
    {
        return assists >= 10;
    }
}// reviewed: 2026-06-25
