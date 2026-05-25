import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE; 

        while (true) {
            System.out.print("Enter a number or 0 to quit: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > largest) {
                
                largest = number;
            }
            if (number < smallest) {
                
                smallest = number;
            }

            System.out.println("Results so far:");
            
            System.out.println("Largest number: " + largest);
            
            System.out.println("Smallest number: " + smallest);
        }

        scanner.close();
    }

}