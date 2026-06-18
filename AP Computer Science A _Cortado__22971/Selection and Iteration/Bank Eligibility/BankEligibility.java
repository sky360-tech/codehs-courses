public class BankEligibility
{
    public static void main(String[] args) 
    {
        // Variables for testing
        int age = 20;
        boolean hasID = true;
        double bankBalance = 50.75;

        // Example 1: AND operator (&&)
        // Both conditions must be true
        if (age >= 18 && hasID) 
        {
            System.out.println("Access granted: You are an adult with proper ID.");
        } 
        else 
        {
            System.out.println("Access denied: Either age or ID requirement is not met.");
        }

        // Example 2: OR operator (||)
        // At least one condition must be true
        if (bankBalance > 100 || age < 25) 
        {
            System.out.println("Eligible for the young saver discount.");
        } 
        else 
        {
            System.out.println("Not eligible for the young saver discount.");
        }

        // Example 3: NOT operator (!)
        // Negates the condition
        if (!hasID) 
        {
            System.out.println("Warning: You must have an ID.");
        } 
        else 
        {
            System.out.println("Thank you for having your ID ready.");
        }
    }
}// reviewed: 2026-06-18
