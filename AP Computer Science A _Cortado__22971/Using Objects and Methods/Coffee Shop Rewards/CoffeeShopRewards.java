public class CoffeeShopRewards
{
    public static void main(String[] args)
    {
        int rewardsCounter = 0;
        
        // Customer buys a coffee
        rewardsCounter++; 
        System.out.print("Current rewards count: ");
        System.out.println(rewardsCounter);
        
        // Customer buys a coffee and a meal
        rewardsCounter += 3; 
        System.out.print("Current rewards count: ");
        System.out.println(rewardsCounter);
        
        // Customer spends a rewards counter to get 10% off
        rewardsCounter--;
        System.out.print("Current rewards count: ");
        System.out.println(rewardsCounter);
        
        // Customer buys a coffee
        rewardsCounter++; 
        System.out.print("Current rewards count: ");
        System.out.println(rewardsCounter);
        
        // Customer spends a rewards counter to get 40% off
        rewardsCounter -= 4;
        System.out.print("Current rewards count: ");
        System.out.println(rewardsCounter);
    }
}

