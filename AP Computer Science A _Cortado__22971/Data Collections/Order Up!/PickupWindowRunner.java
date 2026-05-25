import java.util.Scanner;

public class PickupWindowRunner 
{
    public static void main(String[] args) 
    {
        // Define the menu data
        String[] items = {"1", "2", "3", "4", "5"};
        String[] descriptions = {"Hamburger", "Cheeseburger", "Veggie Burger", "Nachos\t", "Hot Dog\t"};
        String[] costs = {"20", "22", "20", "25", "10"};

        // Create a Menu object
        Menu menu = new Menu(items, descriptions, costs);

        // Print the menu
        menu.printMenu();

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for their order number
        System.out.print("Enter Desired Item #: ");
        String orderNumber = input.nextLine();

        // Use getItemCost to return item cost
        String cost = menu.getItemCost(orderNumber);
        
        if (cost.equals("Invalid")) 
        {
            System.out.println("Invalid item selected.");
        } 
        else 
        {
            // Convert the String to a double and print the total with tip
            double itemCost = Double.parseDouble(cost);
            double total = itemCost * 1.22;
            System.out.println("Order Total (Tip Included): $" + total);
        }
    }
}