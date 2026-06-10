import java.util.ArrayList;

public class EarningsAnalysisRunner
{
    public static void main(String[] args)
    {
        ArrayList<Double> babysittingTotals = new ArrayList<Double>();
        
        // Adds to babysittingTotals
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
        
        // Updated call for Algorithm 1
        System.out.println("Total Earnings: " + EarningsAnalysis.calculateTotalEarnings(babysittingTotals));
        
        // Updated call for Algorithm 2 (Uncomment to test)
        // System.out.println("Earnings Above 50.0: " + EarningsAnalysis.getEarningsAbove(babysittingTotals, 50.0));
        
        // Updated call for Algorithm 3 (Uncomment to test)
        // EarningsAnalysis.insertInOrder(babysittingTotals, 22.00);
        // System.out.println("List after Inserting 22.00: " + babysittingTotals);
    }
}// reviewed: 2026-06-10
