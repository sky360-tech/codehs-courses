import java.util.ArrayList;

public class LineOrderAlgorithms {

    public static void removeStudent(ArrayList<String> list, String studentToRemove)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(studentToRemove))
            {
                list.remove(i);
                i--; // Adjust index for the shift
            }
        }
    }
    
    public static ArrayList<String> reverseLine(ArrayList<String> list)
    {
        ArrayList<String> reversedList = new ArrayList<String>();
        
        for (int i = list.size() - 1; i >= 0; i--)
        {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static ArrayList<String> moveLastToFront(ArrayList<String> list)
    {
        ArrayList<String> newList = new ArrayList<String>();
        
        // Add everyone except the last person
        for (int i = 0; i < list.size() - 1; i++)
        {
            newList.add(list.get(i));
        }
        
        // Grab the last person and put them at index 0
        String lineLeader = list.get(list.size() - 1);
        newList.add(0, lineLeader);
        
        return newList;
    }
}