import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the cost of your dinner
        System.out.println("How much did dinner cost? ");
        double dinner = input.nextDouble();

        // Prompt for the cost of mini-golf (assumed to be laser tag)
        System.out.println("How much is mini-golf for one person? ");
        double golf = input.nextDouble();

        // Prompt for the cost of dessert
        System.out.println("How much did dessert cost? ");
        double dessert = input.nextDouble();

        // Calculate your friend's dinner cost and total costs
        double friendsDinnerCost = 2 * dinner; // Friend's dinner cost
        double totalDinnerCost = dinner + friendsDinnerCost; // Total dinner cost for both

        // Laser tag cost for both people
        double totalGolfCost = 2 * golf;

        // Calculate friend's dessert cost (one-third of your dessert cost)
        double friendsDessertCost = dessert / 3;
        double totalDessertCost = dessert + friendsDessertCost; // Total dessert cost for both

        // Calculate the grand total
        double total = totalDinnerCost + totalGolfCost + totalDessertCost;

        System.out.println("Dinner: " + dinner);
        System.out.println("Golf: " + golf);
        System.out.println("Dessert: " + dessert);
        System.out.println("Grand Total: $" + total);
    }
}