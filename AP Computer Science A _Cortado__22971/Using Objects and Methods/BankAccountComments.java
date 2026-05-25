public class BankAccount 
{
    public static void main(String[] args) 
    {
        // Create an account with an initial balance of $100
        double myAccount = 100;

        // Check For Current Balance
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Adds 50 to current account
        myAccount = myAccount + 50;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Subtracts 30 from the current account.
        myAccount = myAccount - 30;
        System.out.print("Current balance: $");
        System.out.println(myAccount);

        // Subtracts 150 from the current account
        myAccount = myAccount - 150; 
        System.out.print("Current balance: $");
        System.out.println(myAccount);
    }
}