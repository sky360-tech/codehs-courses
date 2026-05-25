import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt for the first integer
        System.out.print("First Int: ");
        int int1 = input.nextInt();

        // Prompt for the second integer
        System.out.print("Second Int: ");
        int int2 = input.nextInt();

        // Perform the division and cast to double
        double result = (double) int1 / int2;

        // Print the result
        System.out.println(result);

    }
}