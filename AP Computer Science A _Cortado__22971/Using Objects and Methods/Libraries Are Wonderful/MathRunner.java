public class MathRunner
{
    public static void main(String[] args)
    {
        // Calculating the square root via two custom methods and
        // one premade method:

        // Approach #1
        double efficient = efficientSqrt(45);
        // Approach #2
        double basic = basicSqrt(45);
        // Approach #3
        double mathClass = Math.sqrt(45);

        // Printing out results
        System.out.print("Result from efficient algorithm: ");
        System.out.println(efficient);

        System.out.print("Result from basic algorithm: ");
        System.out.println(basic);

        System.out.print("Result from Math class algorithm: ");
        System.out.println(mathClass);
    }

    // Approach #1: An efficient and accurate custom method
    public static double efficientSqrt(double number) 
    {
        double guess = number / 2.0;
        double tolerance = 1e-10;
        
        while (Math.abs(guess * guess - number) > tolerance) 
        {
            guess = (guess + number / guess) / 2.0;
        }
        
        return guess;
    }

    // Approach #2: A basic, but less accurate custom method
    public static double basicSqrt(double number) 
    {
        double guess = 0.0;
        double increment = 0.001;
        
        while (guess * guess < number) 
        {
            guess += increment;
        }

        return guess;
    }
    
    /*
    * Approach #3: Notice that the Math.sqrt() method does
    * not need to be defined by us in this program since
    * the default Java Standard Library has already defined it
    * for us. We can just use it (on line 13).
    */
}// reviewed: 2026-07-03
