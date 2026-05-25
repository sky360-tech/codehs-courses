import java.util.ArrayList;

public class EarningsAnalysisRunner
{
    public static void main(String[] args)
    {
        ArrayList<Double> babysittingTotals = new ArrayList<Double>();
        
        babysittingTotals.add(15.50);
        babysittingTotals.add(19.00);
        babysittingTotals.add(23.00);
        babysittingTotals.add(25.00);
        babysittingTotals.add(32.50);
        babysittingTotals.add(40.00);
        babysittingTotals.add(55.50);
        babysittingTotals.add(70.50);
        
        System.out.println("Original List of Earnings: ");
        System.out.println(babysittingTotals);
        
        // Test Task 1: findAverage
        System.out.println("Average earnings: " + EarningsAnalysis.findAverage(babysittingTotals));
        
        // Test Task 2: greaterThanNum (should return an int now)
        double threshold = 50.00;
        System.out.println("Number of babysitting jobs earning above " + threshold + ": " + EarningsAnalysis.greaterThanNum(babysittingTotals, threshold));
        
        // Test Task 3: insertInOrder with edge cases
        // Testing a small number (edge case: beginning of list)
        EarningsAnalysis.insertInOrder(babysittingTotals, 12.00);
        // Testing a large number (edge case: end of list)
        EarningsAnalysis.insertInOrder(babysittingTotals, 85.00);
        
        System.out.println("Updated babysitting earnings data: " + babysittingTotals);
    }
}