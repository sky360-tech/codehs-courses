import java.util.ArrayList;

public class GroceryStoreRunner
{
    public static void main(String[] args)
    {
        ArrayList<GroceryItem> cart = new ArrayList<GroceryItem>();

        cart.add(new GroceryItem("Milk", "Dairy"));
        cart.add(new GroceryItem("Apples", "Produce"));
        cart.add(new GroceryItem("Bread", "Bakery"));
        cart.add(new GroceryItem("Yogurt", "Dairy"));
        cart.add(new GroceryItem("Carrots", "Produce"));

        // Traverse and print items in the cart
        System.out.println("Shopping Cart Items:");
        for (int i = 0; i < cart.size(); i++)
        {
            System.out.println(cart.get(i));
        }

        // Traverse and remove all items in the Dairy category
        System.out.println("\nRemoving all items in 'Dairy' category...");
        for (int i = 0; i < cart.size(); i++)
        {
            if (cart.get(i).getCategory().equals("Dairy"))
            {
                cart.remove(i);
                i--; // adjust index after removal
            }
        }

        // Traverse again to show final state of cart
        System.out.println("\nUpdated Shopping Cart:");
        for (int i = 0; i < cart.size(); i++)
        {
            System.out.println(cart.get(i));
        }

        // Example of what NOT to do (modifying in enhanced for loop)
        /*
        for (GroceryItem item : cart)
        {
            if (item.getCategory().equals("Produce"))
            {
                cart.remove(item); // Will cause ConcurrentModificationException
            }
        }
        */
    }
}
