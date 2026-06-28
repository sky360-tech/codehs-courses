public class Casting 
{
    public static void main(String[] args)
    {
        int num1 = 100;
        int num2 = 40;
        
        // Integer division without casting to a double
        double num3 = num1 / num2;
        System.out.print("Division without Casting: ");
        System.out.println(num3);
        
        // Cast one of the int values to a double 
        double num4 = (double) num1 / num2;
        System.out.print("Division with Casting: ");
        System.out.println(num4);
        
        // Round num4 to the nearest integer
        int roundedNum4 = (int) (num4 + 0.5);
        System.out.print("Rounded to the nearest integer: ");
        System.out.println(roundedNum4);
        
        num4 *= -1;
        System.out.print("Negative num4: ");
        System.out.println(num4);
        
        // Round a negative integer to the nearest integer
        int roundedNegativeNum4 = (int) (num4 - 0.5);
        System.out.print("Negative double rounded to the nearest integer: ");
        System.out.println(roundedNegativeNum4);
    }
}// reviewed: 2026-06-28
