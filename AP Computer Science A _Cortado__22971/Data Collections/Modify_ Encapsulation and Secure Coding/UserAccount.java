public class UserAccount 
{
    private String name;
    private String birthday;
    private String email;
    private String password;
    private String creditCard;

    public UserAccount(String uName, String uBirthday, String uEmail, String uPassword, String uCreditCard) 
    {
        name = uName;
        birthday = uBirthday;
        email = uEmail;
        password = uPassword;
        creditCard = uCreditCard;
    }

    // Step 1: changed both to private
    private String getEmail() 
    {
        return email;
    }

    private void setEmail(String uEmail) 
    {
        email = uEmail;
    }
    
    // Step 2: changeEmail method with password authentication
    public void changeEmail(String attemptedPassword, String newEmail)
    {
        if (attemptedPassword.equals(password))
        {
            setEmail(newEmail);
            System.out.println("Email has been successfully updated to " + newEmail);
        }
        else
        {
            System.out.println("Invalid password. Not authorized to change the email.");
        }
    }
}