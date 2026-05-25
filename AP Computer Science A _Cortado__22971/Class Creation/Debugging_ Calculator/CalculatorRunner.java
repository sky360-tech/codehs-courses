public class CalculatorRunner
{
    public static void main(String[] args) 
    {
        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("\nAdding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.add(10));

        System.out.println("\nMultiplying by (0 + 1) ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.multiply(0)); 

        System.out.println("\nChanging value to 20 ...");
        myTi.setValue(20);
        System.out.print("Adding. Should print 35: ");
        System.out.println(myTi.add());
        
        System.out.println("\nApplying the formula method ... ");
        myTi.formula();
        System.out.print("Calculating. Should print 110: ");
        System.out.println(myTi.formula());
    }
}