import java.util.Scanner;
//Refer to your code from the previous Personalized T-shirts exercise. 
// Modify it using the Scanner class to take user input instead of hard coding 
//       the cost of the shirt. 

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the cost of the t-shirt
        System.out.print("Please enter the cost of the t-shirt: ");
        int cost = scanner.nextInt();

        // Print the original cost
        System.out.println("The t-shirt costs $" + cost);

        // Increment the cost for personalization
        cost++;
        System.out.println("A personalized t-shirt costs $" + cost);

        // Decrement the cost back to the original
        cost--;
        System.out.println("Without personalization, the t-shirt costs $" + cost);
    }
}