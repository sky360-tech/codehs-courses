import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       Scanner scanner = new Scanner(System.in);
        int temperature;

        System.out.println("Starting Taffy Timer...");

        // Loop until the temperature is at least 270
        while (true) {
            System.out.print("Enter the temperature: ");
            temperature = scanner.nextInt();  // Read user input

            if (temperature >= 270) {
                System.out.println("Your taffy is ready for the next step!");
                break;  // Exit loop when temperature is 270 or above
            } else {
                System.out.println("The mixture isn't ready yet.");
            }
        }
    }
}