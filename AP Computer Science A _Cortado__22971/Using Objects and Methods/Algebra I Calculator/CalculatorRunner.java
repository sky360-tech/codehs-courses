public class CalculatorRunner 
{
    public static void main(String[] args) 
    {
        // 1. Calculate Slope between (1, 1) and (5, 10)
        // Pass the coordinates x1, y1, x2, y2
        System.out.println("Slope: " + Calculator.slope(1, 1, 5, 10));

        // 2. Calculate Distance between (2, 3) and (6, 7)
        // Pass the coordinates x1, y1, x2, y2
        System.out.println("Distance: " + Calculator.distance(2, 3, 6, 7));

        // 3. Calculate Roots for x^2 + 2x - 8 = 0
        // The coefficients are A=1, B=2, C=-8
        System.out.println("Roots: " + Calculator.quadRoots(1, 2, -8));
    }
}// reviewed: 2026-06-26
