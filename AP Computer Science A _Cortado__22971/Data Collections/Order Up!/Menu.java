public class Menu 
{
    // Arrays to hold menu items, descriptions, and costs
    private String[] menuItem;
    private String[] itemDescription;
    private String[] menuCost;

    // Constructor to initialize menu arrays using a for loop
    public Menu(String[] items, String[] descriptions, String[] costs) 
    {
        menuItem = new String[items.length];
        itemDescription = new String[descriptions.length];
        menuCost = new String[costs.length];

        for (int i = 0; i < items.length; i++) 
        {
            menuItem[i] = items[i];
            itemDescription[i] = descriptions[i];
            menuCost[i] = costs[i];
        }
    }

    // Method to print the menu
    public void printMenu() 
    {
        System.out.println("----- Menu -----");
        System.out.println("Item #\tDescription\tCost $");

        for (int i = 0; i < menuItem.length; i++) 
        {
            System.out.println(menuItem[i] + "\t" + itemDescription[i] + "\t$" + menuCost[i]);
        }
        System.out.println();
    }

    // Method to return the cost of a selected item
    public String getItemCost(String selectedItem) 
    {
        for (int i = 0; i < menuItem.length; i++) 
        {
            if (menuItem[i].equals(selectedItem)) 
            {
                return menuCost[i];
            }
        }
        return "Invalid";
    }
}