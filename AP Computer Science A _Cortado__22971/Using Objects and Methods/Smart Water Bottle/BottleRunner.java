public class BottleRunner 
{
    public static void main(String[] args) 
    {
       
        WaterBottle myBottle = new WaterBottle(1.0, 1.0);
        
    
        myBottle.drink(0.5);
        
        myBottle.drink(0.5);
        
        myBottle.refill(0.7); // Refill enough to drink more
        
        
        myBottle.drink(0.1);
        
        // Final Print
        System.out.println(myBottle);
    }
}// reviewed: 2026-07-06
