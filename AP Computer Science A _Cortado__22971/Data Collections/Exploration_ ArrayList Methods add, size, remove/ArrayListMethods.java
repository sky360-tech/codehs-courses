import java.util.ArrayList;

public class ArrayListMethods
{
    public static void main(String[] args) 
    {
        // Initialize the list to hold String objects
        ArrayList<String> fruit = new ArrayList<String>();
        
        // Add fruits to the end of the list
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");

        System.out.println("Elements in the list: " + fruit);
        
        // Add to the end while checking if successful
        if (fruit.add("Mango")) 
        {
            System.out.println("I am adding mangoes. They are my favorite!");
        }
        
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);
        
        // Insert fruits at specific index locations
        fruit.add(1, "Blueberry");
        fruit.add(3, "Passionfruit");
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);
        
        // Remove an item by its index position
        fruit.remove(2);
        System.out.println("There are " + fruit.size() + " elements in the list now: " + fruit);

        // --- NEW TASKS BELOW ---

        // Add another fruit to the end
        fruit.add("Orange");

        // Add another fruit at index 4
        fruit.add(4, "Pineapple");

        // Print out the updated size
        System.out.println("Final size: " + fruit.size());

        // Remove the fruit you like the least by index (example: index 0)
        fruit.remove(0);
        
        System.out.println("Final list: " + fruit);
    }
}