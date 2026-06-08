import java.util.ArrayList;

public class ArrayListMethods 
{
    public static void main(String[] args) 
    {
        ArrayList<String> veggies = new ArrayList<String>();
        
        veggies.add("Carrot");
        veggies.add("Zucchini");
        veggies.add("Corn");
        veggies.add("Pepper");
        System.out.println("Elements in list: " + veggies);
        System.out.println("\n----------------------\n");
        
        // Retrieves the element at index 2 (the 3rd item) and stores it in element1
        String element1 = veggies.get(2);
        System.out.println(element1);
        
        System.out.println("Elements in list: " + veggies);
        System.out.println("Size of the list: " + veggies.size());
        System.out.println("\n----------------------\n");
        
        // Replaces index 1 with "Broccoli" and stores the old value ("Zucchini") in element2
        String element2 = veggies.set(1, "Broccoli");
        System.out.println(element2);
        
        // Replaces index 0 with "Cauliflower" and prints the updated list
        veggies.set(0, "Cauliflower");
        System.out.println("Elements in list: " + veggies);

        // --- NEW TASKS ---
        
        // Get and print the second item (index 1)
        String secondItem = veggies.get(1);
        System.out.println("The second item is: " + secondItem);
        
        // Change the first element (index 0) to your favorite vegetable
        veggies.set(0, "Potato"); 
        
        // Print the final resulting list
        System.out.println("Final list: " + veggies);
    }
}// reviewed: 2026-06-08
