public class AnimalGroup 
{
    private String name;
    private String averageSingleWeight; // average weight per animal in the group
    private String quantity;

    // Constructor initializes name, averageSingleWeight, and quantity
    public AnimalGroup(String n, String w, String q) 
    {
        name = n;
        averageSingleWeight = w;
        quantity = q;
    }

    // Returns the animal's name
    public String getName() 
    {
        return name;
    }

    // Returns weight of single animal in group
    public String getWeight() 
    {
        return averageSingleWeight;
    }

    // Returns quantity of animals in group
    public String getQuantity() 
    {
        return quantity;
    }
}