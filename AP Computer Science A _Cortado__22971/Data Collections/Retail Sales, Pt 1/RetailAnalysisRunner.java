public class RetailAnalysisRunner
{
    public static void main(String[] args)
    {
        int[][] sales = {
            {118, 263, 173, 269, 87, 239, 142, 267, 183, 128}, // Monday
            {243, 168, 195, 288, 267, 72, 162, 276, 94, 0},    // Tuesday
            {198, 256, 272, 105, 236, 157, 97, 281, 264, 293}, // Wednesday
            {208, 193, 247, 276, 138, 65, 274, 268, 115, 146}, // Thursday
            {98, 277, 165, 214, 263, 185, 288, 87, 293, 134}, // Friday
            {205, 262, 140, 267, 187, 291, 168, 82, 221, 252}, // Saturday
            {259, 132, 239, 291, 184, 89, 288, 263, 276, 73}  // Sunday
        };

        RetailAnalysis store = new RetailAnalysis(sales);
        
        System.out.println("Maximum sales for product at index 0: ");
        System.out.println(store.getMaxSalesForProduct(0) + "\n");

        System.out.println("Total revenue for Saturday (index 5): ");
        System.out.println(store.getTotalSalesForDay(5) + "\n");
        
        System.out.println("Days each product earned less than $100: ");
        store.printLowSalesCountPerProduct(100);
    }
}// reviewed: 2026-06-14
