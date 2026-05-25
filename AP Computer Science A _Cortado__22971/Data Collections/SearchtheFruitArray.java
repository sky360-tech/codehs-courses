import java.util.Scanner;

public class FruitSearch
{
    public static void main(String[] args)
    {
        String[] fruits = {"Lemon", "Apple", "Apricot", "Guava", "Fig", "Mango"};

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a fruit
        System.out.print("Enter a fruit to search for: ");
        String userFruit = input.nextLine();

        // Call the findFruit method and print the result
        if (findFruit(fruits, userFruit)) {
            System.out.println("The fruit " + userFruit + " is in the list!");
        } else {
            System.out.println("Sorry, " + userFruit + " is not in the list.");
        }
    }
    
    public static boolean findFruit(String[] list, String fruit)
    {
        // Step 1: Write the linear search algorithm
        for (int i = 0; i < list.length; i++) {
            // Optional Extension: use equalsIgnoreCase to ignore capitalization
            if (list[i].equalsIgnoreCase(fruit)) {
                return true; // Match found
            }
        }
        
        return false; // Loop finished without finding a match
    }
}