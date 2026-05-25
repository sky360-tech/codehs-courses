import java.util.Scanner;

public class Palindromes
{
    public static void main(String[] args)
    {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        
        // Check if input is a palindrome
        if (isPalindrome(text))
        {
            System.out.println("Your word is a palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome :(");
        }
    }
    
    /**
     * This method reverses a String by iterating backwards.
     */
    public static String reverse(String text)
    {
        String reversed = "";
        
        // Start at the last index (length - 1) and count down to 0
        for (int i = text.length() - 1; i >= 0; i--)
        {
            // Grab one character at a time and add it to our new string
            reversed += text.substring(i, i + 1);
        }
        
        return reversed;
    }
    
    /**
     * This method determines if a String is a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        // Get the reversed version of the text using our helper method
        String reversedText = reverse(text);
        
        // Use .equals() to compare String values (never use == for Strings!)
        if (text.equals(reversedText))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}