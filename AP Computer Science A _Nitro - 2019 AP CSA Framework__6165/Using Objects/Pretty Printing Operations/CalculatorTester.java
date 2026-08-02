import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        Scanner input = new Scanner(System.in);
        
        Calculator calc = new Calculator();
        
        System.out.println("Enter Two numbers: ");
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        System.out.println(num1 + " + " + num2 + " = " + calc.sum(num1, num2));
        
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));

        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));

        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        
    }
}// reviewed: 2026-08-02
