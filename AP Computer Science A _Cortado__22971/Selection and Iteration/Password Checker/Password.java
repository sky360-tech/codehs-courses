import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter password: ");
        String password = input.nextLine();
        
        // Check if password is at least 8 characters long
        if (password.length() >= 8)
        {
            // If at least 8 long, then check if starts with a #
            if (password.startsWith("#"))
            {
                System.out.println("Password accepted.");
            }
            else // Doesnt start with #
            {
                System.out.println("Password must start with #.");
            }
        }
        else // Shorter than 8 characters
        {
            System.out.println("Password needs 8 or more characters.");
        }
    }
}// reviewed: 2026-06-23
