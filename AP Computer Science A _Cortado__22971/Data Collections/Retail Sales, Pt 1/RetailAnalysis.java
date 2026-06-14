public class RetailAnalysis 
{
    private int[][] sales;

    public RetailAnalysis(int[][] salesData) 
    {
        sales = salesData;
    }

    // Finds the maximum sales value for a specific product column
    public int getMaxSalesForProduct(int productIndex) 
    {
        int maxSales = sales[0][productIndex];

        for (int dayIndex = 1; dayIndex < sales.length; dayIndex++) 
        {
            if (sales[dayIndex][productIndex] > maxSales) 
            {
                maxSales = sales[dayIndex][productIndex];
            }
        }
        return maxSales;
    }

    // Calculates the total revenue for all products on a specific day row
    public int getTotalSalesForDay(int dayIndex) 
    {
        int dailyTotal = 0;

        for (int productIndex = 0; productIndex < sales[dayIndex].length; productIndex++) 
        {
            dailyTotal += sales[dayIndex][productIndex];
        }
        return dailyTotal;
    }

    // Counts and prints how many days each product stayed below a revenue threshold
    public void printLowSalesCountPerProduct(int threshold)
    {
        int[] lowSalesDaysCount = new int[sales[0].length];

        for (int dayIndex = 0; dayIndex < sales.length; dayIndex++)
        {
            for (int productIndex = 0; productIndex < sales[0].length; productIndex++)
            {
                if (sales[dayIndex][productIndex] < threshold)
                {
                    lowSalesDaysCount[productIndex]++;
                }
            }
        }

        for (int count : lowSalesDaysCount)
        {
            System.out.print(count + " ");
        }
    }
}// reviewed: 2026-06-14
