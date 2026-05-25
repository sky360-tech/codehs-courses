public class CalculatorRunner
{
    public static void main(String[] args)
    {
        // Use class methods from Calculator (different class)
        int sum = Calculator.add(10, 5);
        int difference = Calculator.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        // Use class method from this class
        displayEndMessage();
    }

    // A class method that can be called without referencing class name
    public static void displayEndMessage()
    {
        System.out.println("Calculation complete.");
    }
}