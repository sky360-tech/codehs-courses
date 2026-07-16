import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many grams of sugar have you eaten today? ");
        int sugar = input.nextInt();
        
        // Check if the grade is greater than or equal to 90
	    boolean sugarConsumed = sugar < 30;
	    System.out.println("You can eat more sugar: " + sugarConsumed);  
    }
}// reviewed: 2026-07-16
