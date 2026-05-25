public class AccountRunner 
{
    public static void main(String[] args) 
    {
        UserAccount account = new UserAccount("Ada Lovelace", 
            "1/3/2012", "coding4l!fe@gmail.com", 
            "password1234", "1111222233334444");
        
        // account.email = "byte.bandit@blackhat.com";  // commented out — direct field access is blocked (private)
        System.out.println("Email address on file: " + account.getEmail());
        account.setEmail("byte.bandit@blackhat.com");
        System.out.println("Email address on file: " + account.getEmail());
    }
}