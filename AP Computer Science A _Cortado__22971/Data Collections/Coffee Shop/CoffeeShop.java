public class CoffeeShop
{
    private CoffeeBag[] inventory;

    // Custom constructor with coffee types and amount
    public CoffeeShop(String[] types, double amount)
    {
        inventory = new CoffeeBag[types.length];

        for (int i = 0; i < types.length; i++)
        {
            inventory[i] = new CoffeeBag(types[i], amount);
        }
    }

    // Default constructor, creating 5 bags of coffee
    public CoffeeShop()
    {
        inventory = new CoffeeBag[5];
        inventory[0] = new CoffeeBag("Espresso", 5.0);
        inventory[1] = new CoffeeBag("House Blend", 5.0);
        inventory[2] = new CoffeeBag("Mexican", 5.0);
        inventory[3] = new CoffeeBag("Colombian", 5.0);
        inventory[4] = new CoffeeBag("French Roast", 5.0);
    }

    // Adds amount to all bags in inventory
    public void addInventory(double amount)
    {
        for (CoffeeBag bag : inventory)
        {
            bag.add(amount);
        }
        System.out.println(amount + " lbs of all coffee types added.");
    }

    // If choice is in inventory and amount is available, sell it
    public void sellCoffee(String choice, double amount)
    {
        for (CoffeeBag bag : inventory)
        {
            if (bag.getType().toLowerCase().equals(choice.toLowerCase()))
            {
                if (bag.getWeight() >= amount)
                {
                    bag.sell(amount);
                    System.out.println(amount + " lbs of " + bag.getType() + " coffee sold.");
                    return;
                }
            }
        }
        System.out.println("Sorry, we don't have your request in stock.");
    }

    // Print out the amount in stock for each bag
    public void displayInventory()
    {
        for (CoffeeBag bag : inventory)
        {
            System.out.println(bag);
        }
        System.out.println();
    }
}