public class DeMorgansExample
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        // Check equivalence: !(a && b) == !a || !b
        boolean result1 = !(a && b);
        boolean result2 = !a || !b;

        System.out.println("!(a && b) = " + result1);
        System.out.println("!a || !b = " + result2);
        System.out.println();

        boolean x = true;
        boolean y = true;

        // Check equivalence: !(x || y) == !x && !y
        boolean result3 = !(x || y);
        boolean result4 = !x && !y;

        System.out.println("!(x || y) = " + result3);
        System.out.println("!x && !y = " + result4);
    }
}
