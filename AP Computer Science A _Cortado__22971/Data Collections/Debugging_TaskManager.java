import java.util.ArrayList;

public class TaskManager
{
    public static void main(String[] args)
    {
        // Create and populate the task list
        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Sleep In");
        tasks.add("Clean");
        tasks.add("Clean");
        tasks.add("Study");
        tasks.add("Exercise");

        // FIX 1: Changed i <= tasks.size() to i < tasks.size() to avoid IndexOutOfBoundsException
        for (int i = 0; i < tasks.size(); i++)
        {
            System.out.println("Task " + i + ": " + tasks.get(i));
        }

        // FIX 2: Changed = (assignment) to .equals() for String comparison
        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).equals("Study"))
            {
                tasks.add("Treat yourself with some ice cream");
                break; // Optional: prevents infinite loop if "Study" was added again
            }
        }

        // FIX 3: Replaced for-each loop with standard for loop to avoid ConcurrentModificationException
        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).equals("Sleep In"))
            {
                tasks.remove(i);
                i--; // Adjust index after removal
            }
        }

        // FIX 4: Changed task.size() to task.length() (Strings use length(), ArrayLists use size())
        for (int i = 0; i < tasks.size(); i++)
        {
            String task = tasks.get(i);
            if (task.length() > 10)
            {
                System.out.println("\n" + task + " is a long task");
            }
        }

        // FIX 5: Added i-- to handle consecutive "Clean" tasks correctly
        for (int i = 0; i < tasks.size(); i++)
        {
            if (tasks.get(i).equals("Clean"))
            {
                tasks.remove(i);
                i--; 
            }
        }

        // Print the final task list
        System.out.println("\nFinal task list: " + tasks);
    }
}// reviewed: 2026-06-08
