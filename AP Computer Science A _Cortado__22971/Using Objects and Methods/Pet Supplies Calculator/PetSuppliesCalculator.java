public class PetSuppliesCalculator
{
    public static void main(String args[])
    {
        double foodBowl = 10.99;
        double toy = 3.99;
        double collar = 8.50;
        double catBed = 22.55;
        int numCats = 3;
    
        // Calculate the total amount to purchase supplies for one cat   
        double totalForOneCat = foodBowl + toy + collar + catBed;
        System.out.print("Total cost for one cat: ");
        System.out.println(totalForOneCat);
        
        // Use the total amount calculated above to find the total amount for all of the cats
        double amountForAllCats = totalForOneCat * numCats;
        System.out.print("Total cost for all cats: ");
        System.out.println(amountForAllCats);
        
        // You get convinced to adopt 4 cats instead of 3
        numCats = 4;
        
        // Recalculate the cost with the updated value
        amountForAllCats = totalForOneCat * numCats;
        System.out.print("Total cost for all cats: ");
        System.out.println(amountForAllCats);
    }
}// reviewed: 2026-07-05
