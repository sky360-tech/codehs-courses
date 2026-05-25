public class RelationalDebugging 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 15;
        int c = 20;

        // Incorrect relational expressions
        boolean isEqual = a = b;
        boolean isGreater = c >;
        boolean isLessOrEqual = <= c;

        // Print results
        System.out.println("a is equal to b: " + isEqual);
        System.out.println("c is greater than b: " + isGreater);
        System.out.println("b is less than or equal to c: " + isLessOrEqual);
    }
}
