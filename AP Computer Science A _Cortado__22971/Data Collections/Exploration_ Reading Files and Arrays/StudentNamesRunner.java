import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StudentNamesRunner
{
    public static void main(String[] args)
    {
        String[] students = new String[50];
        
        try
        {
            File file = new File("StudentNames.txt");
            Scanner input = new Scanner(file);
            int index = 0;
            
            while (input.hasNext())
            {
                String name = input.nextLine();
                students[index] = name;
                index++;
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        
        // Original mystery call
        mystery(students, "Maya");
        
        // Two additional mystery calls (Question 5)
        mystery(students, "Hassan");  // should print "Hassan" twice — Tarek Hassan & Nabil Hassan
        mystery(students, "Brown");   // should print "Brown" twice — Quentin Brown & Olivia Brown
        
        // Modify Task 1 & 2 — testing firstNameLetter
        System.out.println("Names starting with 'A': " + firstNameLetter(students, "A")); // Aisha, Aaliyah → 2
        System.out.println("Names starting with 'Z': " + firstNameLetter(students, "Z")); // Zane, Zara → 2
        System.out.println("Names starting with 'K': " + firstNameLetter(students, "K")); // Karim, Kaitlyn → 2
    }
    
    public static void mystery(String[] arr, String name)
    {
        for (String item : arr)
        {
            if (item != null && item.contains(name))
            {
                System.out.println(name);
            }
        }
    }
    
    /**
     * Returns the number of students whose first name starts with the given letter.
     * @param arr    the array of student names (may contain null slots)
     * @param letter a single uppercase or lowercase letter to check against
     * @return count of students whose first name begins with letter
     */
    public static int firstNameLetter(String[] arr, String letter)
    {
        int count = 0;
        
        for (String item : arr)
        {
            // Optional extension: null check before accessing the element
            if (item != null && item.substring(0, 1).equalsIgnoreCase(letter))
            {
                count++;
            }
        }
        
        return count;
    }
}// reviewed: 2026-06-10
