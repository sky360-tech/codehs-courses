import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a password to check: ");
        String userPassword = input.nextLine();
        
        if (passwordCheck(userPassword))
        {
            System.out.println("Valid password!");
        }
        else
        {
            System.out.println("Invalid password. Must be 12+ chars and contain a letter, number, and special character.");
        }
    }
    
    public static boolean passwordCheck(String password)
    {
        // 1. Check length requirement immediately
        if (password.length() < 12)
        {
            return false;
        }
        
        // Define our search strings
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specials = "!@#$%^&*()-_=+|[]{};:/?.>";
        
        // Booleans to track if we've found what we need
        boolean foundLetter = false;
        boolean foundNumber = false;
        boolean foundSpecial = false;
        
        // 2. Loop through the password character by character
        for (int i = 0; i < password.length(); i++)
        {
            String character = password.substring(i, i + 1);
            
            // Check if the character exists in our defined strings
            if (letters.contains(character))
            {
                foundLetter = true;
            }
            else if (numbers.contains(character))
            {
                foundNumber = true;
            }
            else if (specials.contains(character))
            {
                foundSpecial = true;
            }
        }
        
        // 3. Return true only if ALL three conditions were met
        return foundLetter && foundNumber && foundSpecial;
    }
}