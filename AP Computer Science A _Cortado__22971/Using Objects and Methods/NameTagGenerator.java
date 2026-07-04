import java.util.Scanner;

public class NameTagGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // 1. Ask the user for two names
        System.out.print("Enter a name: ");
        String name1 = input.nextLine();
        
        System.out.print("Enter a name: ");
        String name2 = input.nextLine();
        
        // 2. Print out a name tag for each name
        displayNameTag(name1);
        displayNameTag(name2);
        
        // 3. Determine if the two names are equivalent
        // Note: Use .equals() for String comparison, not ==
        boolean isSame = name1.equals(name2);
        System.out.println("Are the two names the same?: " + isSame);
    }
    
    /* Takes in a person's name and prints a nametag */
    public static void displayNameTag(String name)
    {
        // Calculate the length once to reuse it
        int len = name.length();
        
        // Get the last letter using substring
        // The last index is always length - 1
        String lastLetter = name.substring(len - 1);
        
        // Print the nametag
        System.out.println("****************");
        System.out.println("Name: " + name);
        System.out.println("Length: " + len + " characters");
        System.out.println("Last Letter: " + lastLetter);
        System.out.println("****************");
    }
}// reviewed: 2026-07-04
