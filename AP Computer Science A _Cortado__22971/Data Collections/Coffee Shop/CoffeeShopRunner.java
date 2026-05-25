public class CoffeeShopRunner 
{
    public static void main(String[] args) 
    {
        // Create array of coffee bean types
        String[] coffeeTypes = {"Espresso", 
                                "House Blend", 
                                "Mexican", 
                                "Columbian",
                                "French Roast"};

        // Create new coffee shop with types and initial amounts
        CoffeeShop brew = new CoffeeShop(coffeeTypes, 10.0);

        // Print inventory
        System.out.println("Current Inventory:");
        brew.displayInventory();

        // Add 2.0 lbs to inventory
        brew.addInventory(2.0);

        // Sell 0.5 lbs of Mexican coffee
        brew.sellCoffee("Mexican", 0.5);

        // Try to sell 20 lbs of Columbian coffee
        brew.sellCoffee("Columbian", 20.0);

        // Print inventory
        System.out.println("\nCurrent Inventory:");
        brew.displayInventory();
    }
}