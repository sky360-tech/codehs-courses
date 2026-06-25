import java.util.Scanner;

public class TheaterDiscounts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int dayOfWeek = scanner.nextInt();

        System.out.print("Enter the customer's age: ");
        int age = scanner.nextInt();

        getDiscount(dayOfWeek, age);
    }

    
       public static void getDiscount(int dayOfWeek, int age) {
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("Invalid day.");
        } else {
            if (dayOfWeek >= 3 && dayOfWeek <= 7) {
                
                if (age >= 65) {
                    System.out.println("Senior discount: 20% off");
                } else if (age >= 12 && age <= 17) {
                    System.out.println("Student discount: 15% off");
                } else if (age < 12) {
                    System.out.println("Child discount: 50% off");
                } else {
                    System.out.println("No discount.");
                }
            } else {
                System.out.println("Theater is closed.");
            }
        }
    }


}// reviewed: 2026-06-25
