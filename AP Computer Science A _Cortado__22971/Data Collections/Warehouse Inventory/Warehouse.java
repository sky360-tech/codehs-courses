public class Warehouse
{
    private int[] stockLevels;
    private int productCount;

    public Warehouse(int initialStock)
    {
        productCount = 5;
        stockLevels = new int[productCount];

        for (int i = 0; i < stockLevels.length; i++)
        {
            stockLevels[i] = initialStock;
        }
    }

    public void displayStock()
    {
        System.out.println("Current Stock Levels:");
        
        for (int i = 0; i < stockLevels.length; i++)
        {
            System.out.println("Product " + (i + 1) + ": " + stockLevels[i] + " units");
        }
    }
}// reviewed: 2026-06-17
