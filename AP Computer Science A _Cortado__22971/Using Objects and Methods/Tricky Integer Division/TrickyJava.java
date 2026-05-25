public class TrickyJava
{
    public static void main(String[] args)
    {
        int candyBars = 20;
        int friends = 5;
        
        System.out.print("Candy bars: ");
        System.out.println(candyBars);
        
        System.out.print("Friends: ");
        System.out.println(friends);
        
        // You expect it to be 4.. and it is 4
        System.out.print("Candy per person: ");
        System.out.println(candyBars / friends);
        
        // Add 1 to friends so friends is now 6
        friends = friends + 1;

        System.out.print("\nCandy bars: ");
        System.out.println(candyBars);
        System.out.print("Friends: ");
        System.out.println(friends);

        // You expect it to be 3.33 because 20 / 6 is 3.33
        // But the output is 3 due to integer division 
        System.out.print("Candy per person: ");
        System.out.println(candyBars / friends);
        
        // Change one of the values to a double
        // and you get the expected decimal value of 3.33..
        System.out.println("\nDivision with one value as a double: ");
        double candyBarsDouble = 20;
        System.out.print("Candy per person: ");
        System.out.println(candyBarsDouble / friends);
    }
}