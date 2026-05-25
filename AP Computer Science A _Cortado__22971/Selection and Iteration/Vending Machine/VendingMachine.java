public class VendingMachine 
{
    // Tracks how many items are in the machine
    private int itemsAvailable;

    // Constructor initializing items in machine
    public VendingMachine(int initialItems)
    {
        itemsAvailable = initialItems;
    }

    public int getItems()
    {
        return itemsAvailable;
    }

    // Allows user to purchase an item if there are items available
    // and if payment is larger than price
    public void purchaseItem(double price, double payment)
    {
        if (itemsAvailable == 0)
        {
            System.out.println("Sorry, no  more items available.");
        }
        else if (payment < price)
        {
            System.out.println("Please input enough money.");
        }
        else 
        {
            itemsAvailable--;
            
            System.out.println("Thank you for your purchase. Dispensing in change...");
            
            // Call the giveChange method, sending in the amount
            // of change in dollars as its argument
            
        }
    }

    /* 
     * Determines the appropriate change in coins and prints results.
     * @param change - the difference between payment and price, in dollars.
    */
    public void giveChange(double change)
    {
        // Complete this method
        
        
    } 
}