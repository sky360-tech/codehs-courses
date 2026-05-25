public class ShoppingCart 
{
    private int numItems;
    private double totalCost;

    // Constructor for an empty shopping cart
    public ShoppingCart() 
    {
        numItems = 0;
        totalCost = 0;
    }

    // Method to add an item
    public void addItem(double price) 
    {
        numItems++;
        totalCost += price;
    }

    public double getTotalCost() 
    {
        return totalCost;
    }

    public double getNumberOfItems() 
    {
        return numItems;
    }

    public String toString()
    {
        return "Your cart has " + numItems + " items with a total cost of $" + totalCost;
    }
}