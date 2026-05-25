import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter two doubles");
        double xx = input.nextDouble();
        double yy = input.nextDouble();
        calc.add(xx,yy);
        calc.subtract(xx,yy);
        calc.multiply(xx,yy);
        calc.divide(xx,yy);
        System.out.println(calc);
     }
}