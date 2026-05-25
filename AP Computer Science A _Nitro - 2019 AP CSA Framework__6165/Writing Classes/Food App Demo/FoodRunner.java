import java.util.Scanner;

public class FoodRunner

{

    public static void main(String[] args)

{

    Scanner input = new Scanner(System.in);

    Food burger = new Food("Hamburgers", 600);

    Food fries = new Food("French Fries", 350);
    
    Food coke = new Food("Coke", 200);

    System.out.println(burger);

    System.out.println("How many would you like?");

    int burgerCount = input.nextInt();

    System.out.println(fries);

    System.out.println("How many would you like?");

    int friesCount = input.nextInt();

    System.out.println(coke);

    System.out.println("How many would you like?");

    int cokeCount = input.nextInt();

    int totalCal = burgerCount * burger.getCalories() + friesCount * fries.getCalories() + cokeCount * coke.getCalories();

    System.out.println("Your meal will have a total of " + totalCal + " calories.");

    }

}