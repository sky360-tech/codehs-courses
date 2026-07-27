import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
       Fraction frac1 = new Fraction(1, 2);

       Scanner input = new Scanner(System.in);
       System.out.println("Enter the numerator: ");
       int numerator = input.nextInt();
       System.out.println("Enter the denominator: ");
       int denominator = input.nextInt();
       Fraction frac2 = new Fraction(numerator, denominator);
       int sum1 = (frac1.getNumerator() * frac2.getDenominator() + frac1.getDenominator() * frac2.getNumerator());
       int sum2 = (frac1.getDenominator() * frac2.getDenominator());
       Fraction sum = new Fraction(sum1, sum2);
       System.out.println(frac1.toString() + " + " + frac2.toString() + " = " + sum);


        
    }
}// reviewed: 2026-07-27
