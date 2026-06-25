import java.util.Scanner;

public class TemperatureCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        int temperature = scanner.nextInt();

        if (temperature > 80)
        {
            System.out.println("It's hot outside. Stay hydrated!");
        }

        if (temperature >= 32)
        {
            System.out.println("It's warm enough to go outside.");
        } 
        else
        {
            System.out.println("It's freezing outside, stay warm!");
        }

        System.out.println("Have a nice day!");
    }
}
// reviewed: 2026-06-25
