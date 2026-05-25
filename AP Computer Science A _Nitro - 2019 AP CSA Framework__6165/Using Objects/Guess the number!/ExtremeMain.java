import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Create an Extremes object
        Extremes x = new Extremes();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("You'd need to multiply your number by 21474836 to reach the max value!");
        int maxGuess = input.nextInt();
        // Compute and display what they'd need to multiply by
        int maxMultiplier = x.maxQuotient(maxGuess);
        System.out.printf("You need to multiply the number by %d to reach the max value!%n", maxMultiplier);
        
        // to reach the maximum number

        // Ask the user to guess the minimum value of an Integer
        System.out.println("You'd need to multiply your number by 5368709 to reach the min value!");
        int minGuess = input.nextInt();
        // Compute and display what they'd need to multiply by
        int minMultiplier = x.minQuotient(minGuess);
        System.out.printf("You need to multiply your number by  %d to reach the min value!%n", minMultiplier);
        // to reach the minimum number

    }
}