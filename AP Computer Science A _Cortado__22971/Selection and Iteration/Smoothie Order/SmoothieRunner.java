import java.util.Scanner;

public class SmoothieRunner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What type of boost would you like?");
        System.out.println("1. Protein");
        System.out.println("2. Spinach");
        System.out.println("3. Ginger");
        
        int boostInt = input.nextInt();
        String boost; // This is the variable the Smoothie object will use
        
        // Use if-else-if here to assign the String 'boost'
        if (boostInt == 1) {
            boost = "protein";
        } else if (boostInt == 2) {
            boost = "spinach";
        } else if (boostInt == 3) {
            boost = "ginger";
        } else {
            System.out.println("Invalid number. You will receive ginger by default.");
            boost = "ginger";
        }
        
        // Now create the object and print
        Smoothie mySmoothie = new Smoothie(boost);
        System.out.println("You ordered a " + mySmoothie.toString());
        System.out.println(mySmoothie.getNutrients());
    }
}// reviewed: 2026-06-24
