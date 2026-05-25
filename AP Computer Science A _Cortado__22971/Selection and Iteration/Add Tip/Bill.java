public class Bill 
{
    private double mealCost;
    private int customerCount;

    // Initialize the bill with meal cost and number of customers
    public Bill(double cost, int count) 
    {
        mealCost = cost;
        customerCount = count;
    }

    // Calculate and add a tip based on the number of customers
    public void addTip() 
    {
        if (customerCount >= 8) 
        {
            // Apply 25% tip for 8 or more customers
            mealCost += mealCost * 0.25;
        } 
        else 
        {
            // Apply 20% tip for fewer than 8 customers
            mealCost += mealCost * 0.20;
        }
    }

    // Display the updated cost
    public void displayTotal() 
    {
        System.out.println("The total cost including tip is: $" + mealCost);
    }
}