public class RetailAnalysis 
{
    private int[][] sales;

    // Constructor to initialize the sales data array
    public RetailAnalysis(int[][] salesData) 
    {
        sales = salesData;
    }

    // Checks for any value of 0 in the 2D array
    public boolean hasMissingData()
    {
        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                if (sales[row][col] == 0)
                {
                    return true; // Exit immediately if a 0 is found
                }
            }
        }
        return false;
    }

    // Calculates the average sales for a specific product (column)
    public double averageSalesForProduct(int productIndex)
    {
        double total = 0;
        // Iterate through each day (row) for the given product index (column)
        for (int row = 0; row < sales.length; row++)
        {
            total += sales[row][productIndex];
        }
        
        // Return average (Total sum / number of days)
        return total / sales.length;
    }
}// reviewed: 2026-06-14
