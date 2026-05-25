import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);

        // Prompt for a double variable
        System.out.print("Enter a double: ");
        double myDouble = input.nextDouble();

        // Print the double value
        System.out.println(myDouble);

        // Cast the double value to an int and print it
        int myInt = (int) myDouble;
        System.out.println(myInt);

        // Add 0.5 to the double variable
        myDouble += 0.5;

        // Print the new double value
        System.out.println(myDouble);

        // Cast the new double value to an int and print it
        myInt = (int) myDouble;
        System.out.println(myInt);
    }
}