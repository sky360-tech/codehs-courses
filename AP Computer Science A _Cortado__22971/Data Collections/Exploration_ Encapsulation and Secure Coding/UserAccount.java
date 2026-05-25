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

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String uEmail) 
    {
        email = uEmail;
    }
}