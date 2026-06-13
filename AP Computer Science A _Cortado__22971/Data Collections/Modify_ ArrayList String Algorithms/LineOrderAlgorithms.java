import java.util.ArrayList;

public class LineOrderAlgorithms
{
    // ... (existing methods: removeStudent, reverseOrder, shiftRight)

    // Shifts every name one position to the left. 
    // The student at the front (index 0) moves to the end.
    public static ArrayList<String> shiftLeft(ArrayList<String> list)
    {
        if (list.size() == 0) return new ArrayList<String>();
        
        ArrayList<String> newOrder = new ArrayList<String>();

        // Add elements starting from the second student (index 1) to the end
        for (int i = 1; i < list.size(); i++)
        {
            newOrder.add(list.get(i));
        }

        // Add the original first student to the end of the new list
        newOrder.add(list.get(0));

        return newOrder;
    }

    // Checks if two students are standing next to each other in any order.
    public static boolean checkPairs(String name1, String name2, ArrayList<String> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            String current = list.get(i);
            String next = list.get(i + 1);

            // Check if (name1, name2) OR (name2, name1) are at i and i+1
            if ((current.equals(name1) && next.equals(name2)) || 
                (current.equals(name2) && next.equals(name1)))
            {
                return true;
            }
        }
        return false;
    }
}// reviewed: 2026-06-13
