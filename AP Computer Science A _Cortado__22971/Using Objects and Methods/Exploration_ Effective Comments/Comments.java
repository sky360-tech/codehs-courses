import java.util.Scanner;

public class Comments 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // #1) Declares a variable
        int num1 = 0;
        
        // #2) Prompting user for the first number
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt(); 

        /* 
        * #3) This line of code is important because it declares
        * a second variable, num2, and initializes the value
        * to 0. The user will then set its value in the following
        * lines of code.
        */
        int num2 = 0;
        
        /* #4) Prompting user for the second number */
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        // #5) Performing calculation
        int sum = num1 + num2;
        
        // #6) Print statements
        System.out.print("The sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" is: ");
        System.out.println(sum);

        // #7) Demonstrating casting a sum to a double
        double average = (double) sum / 2;
        
        // #8) Printing the average result with a clear explanation
        System.out.print("The average of the two numbers is: ");
        System.out.println(average);
    }
}// reviewed: 2026-06-30
