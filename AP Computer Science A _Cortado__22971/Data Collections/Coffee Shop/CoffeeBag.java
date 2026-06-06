public class CoffeeBag
{
    private String type;
    private double weight; // in pounds

    // Constructor
    public CoffeeBag(String coffeeType, double initialWeight)
    {
        type = coffeeType;
        weight = initialWeight;
    }

    // Adds amount when coffee is purchased
    public void add(double amount)
    {
        if (amount > 0)
        {
            weight += amount;
        }
    }

    // Subtracts amount when coffee is sold
    public void sell(double amount)
    {
        if (amount > 0 && amount <= weight)
        {
            weight -= amount;
        }
    }

    public String getType()
    {
        return type;
    }

    public double getWeight()
    {
        return weight;
    }

    public String toString()
    {
        return "Type: " + type + ", Weight: " + weight + " lbs";
    }
}// reviewed: 2026-06-06
