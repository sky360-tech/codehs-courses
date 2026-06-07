import java.util.ArrayList;

public class DataPurge
{
    // Removes duplicate names from the list.
    public static void removeDuplicates(ArrayList<String> members)
    {
        for (int i = 0; i < members.size(); i++)
        {
            String currentName = members.get(i);
            
            // Look at all elements AFTER the current index
            for (int j = i + 1; j < members.size(); j++)
            {
                if (currentName.equals(members.get(j)))
                {
                    System.out.println("Duplicate " + currentName + " removed");
                    members.remove(j);
                    // Decrement j so we don't skip the element that shifted into this spot
                    j--; 
                }
            }
        }
    }

    // Removes all entries that match the specified search string.
    public static void removeName(ArrayList<String> members, String name)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if (members.get(i).equals(name))
            {
                System.out.println("Removing " + name);
                members.remove(i);
                // Adjust index to account for the shift
                i--;
            }
        }
    }

    // Returns true if all names in the list follow the formatting rules.
    public static boolean correctlyFormatted(ArrayList<String> members)
    {
        for (String name : members)
        {
            // 1. Check for exactly one space to separate first and last name
            int spaceIndex = name.indexOf(" ");
            if (spaceIndex == -1 || spaceIndex != name.lastIndexOf(" "))
            {
                return false;
            }

            // 2. Split into first and last name
            String first = name.substring(0, spaceIndex);
            String last = name.substring(spaceIndex + 1);

            // 3. Ensure both are non-empty
            if (first.length() == 0 || last.length() == 0)
            {
                return false;
            }

            // 4. Check if first characters are uppercase
            String firstLetter = first.substring(0, 1);
            String lastLetter = last.substring(0, 1);

            if (!firstLetter.equals(firstLetter.toUpperCase()) || 
                !lastLetter.equals(lastLetter.toUpperCase()))
            {
                return false;
            }
        }
        // If we make it through the whole loop without returning false
        return true;
    }
}// reviewed: 2026-06-07
