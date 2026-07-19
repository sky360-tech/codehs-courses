import java.util.Scanner;

public class Password
{
    static boolean tOrF = false;

    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        
        // Corrected here to use 'password' instead of 'pw'
        if (passwordCheck(password))
        {
            System.out.println("Your password is valid!");
        }
        else
        {
            System.out.println("Your password is not valid.");
        }
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        if (password.length() < 8)
        {
            return false;
        }
        else
        {
            for (int i = 0; i < password.length(); i++)
            {
                char c = password.charAt(i);
                if (Character.isWhitespace(c) || !(Character.isLetterOrDigit(c)))
                {
                    return false;
                }
            }
            return true;
        }
    }
}// reviewed: 2026-07-19
