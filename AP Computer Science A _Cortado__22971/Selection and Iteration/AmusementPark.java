import java.util.Scanner;

public class AmusementPark
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        
        // Get user input for roller coaster
        System.out.println("Enter your age: "); 
        int age = input.nextInt();
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        
        // Check to see if user can ride roller coaster
        checkRollerCoaster(age, height);
        
        // Get user input for pool
        System.out.println("Can you swim? Enter true or false.");
        boolean canSwim = input.nextBoolean();
        System.out.println("Do you have a life jacket? Enter true or false.");
        boolean hasLifeJacket = input.nextBoolean();
        
        // Check to see if user can swim in pool
        checkPool(canSwim, hasLifeJacket);
    }

    // Checks to see if the user can ride the roller coaster
    public static void checkRollerCoaster(int age, int height)
    {
        int AGE_LIMIT = 12;
        int HEIGHT_LIMIT = 48;

        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // De Morgan's Law: !(A && B) becomes !A || !B
        boolean cannotRide = !oldEnough || !tallEnough;
        
        if (cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.\n");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!\n");
        }
    }

    // Checks to see if the user can swim in the pool
    public static void checkPool(boolean canSwim, boolean hasLifeJacket)
    {
        // De Morgan's Law: !(A || B) becomes !A && !B
        boolean cannotSwim = !canSwim && !hasLifeJacket;
        
        if (cannotSwim)
        {
            System.out.println("You may not swim in the pool.\n");
        }
        else
        {
            System.out.println("You may swim in the pool!\n");
        }
    }
}