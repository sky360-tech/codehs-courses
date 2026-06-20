import java.util.Scanner;

public class FactorsRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Get number
        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        // Get possible factor
        System.out.println("Enter possible factor: ");
        int factor = input.nextInt();

        // Check to see if factor is in fact a factor
        boolean isFactor = Factors.checkFactors(number, factor);
        
        System.out.println(factor + " is a factor of " + number + ": " + isFactor);
    }
}// reviewed: 2026-06-20
