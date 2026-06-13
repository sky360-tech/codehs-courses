import java.util.Scanner;

public class AccountRunner 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        UserAccount account = new UserAccount("Ada Lovelace", 
            "1/3/2012", "coding4l!fe@gmail.com", 
            "password1234", "1111222233334444");

        // These lines cause an error now because getEmail and setEmail are private
        // System.out.println("Email address on file: " + account.getEmail());
        // account.setEmail("byte.bandit@blackhat.com");
        // System.out.println("Email address on file: " + account.getEmail());
        
        // Ask the user for their password
        System.out.println("Password: ");
        String attemptedPassword = scanner.nextLine();

        // Ask the user for the new email
        System.out.println("New email: ");
        String newEmail = scanner.nextLine();

        // Call the changeEmail method
        account.changeEmail(attemptedPassword, newEmail);

        scanner.close();
    }
}// reviewed: 2026-06-13
