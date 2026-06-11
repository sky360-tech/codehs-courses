import java.util.ArrayList;

public class Max
{
    public static void main(String[] args)
    {
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        
        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);
    }
    
        // Returns the maximum integer in an ArrayList of integers
    public static int findMax(ArrayList<Integer> list)
    {
        // Check if the list is empty to avoid errors
        if (list.size() == 0) {
            return 0; 
        }

        // Initialize max with the first element of the list
        int max = list.get(0);
        
        // Loop through the rest of the list
        for (int i = 1; i < list.size(); i++) {
            // If the current element is greater than our current max, update max
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        
        return max;
    }

}// reviewed: 2026-06-11
