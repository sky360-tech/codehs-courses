public class TipCalculator
{
    public static void main(String[] args)
    {
        double meal = 25.99;
        double appetizer = 6.50;
        double drink = 3.99;
        
        // Create variables to store the different tip options
        double tip15 = 0.15;
        double tip20 = 0.20;
        double tip25 = 0.25;
        
        double totalNoTip = meal + appetizer + drink;
        // Print out the total and different amounts for each tip option
        System.out.println("Total cost of the meal: " + totalNoTip);
        System.out.println("15% tip amount: " + tip15 * totalNoTip);
        System.out.println("20% tip amount: " + tip20 * totalNoTip);
        System.out.println("25% tip amount: " + tip25 * totalNoTip);
    }
}// reviewed: 2026-07-06
