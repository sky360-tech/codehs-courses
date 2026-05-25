import java.util.Scanner;
public class TaffyRunner
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int temp = 0;

       System.out.println("Starting Taffy Timer...");

        while (temp < 270) {
            System.out.print("Enter the temperature: ");
            temp = input.nextInt();
    
            if (temp < 270) {
                 System.out.println("\nThe mixture isn't ready yet.");
                }
        }

        System.out.println("Your taffy is ready for the next step!");

       
    }
}