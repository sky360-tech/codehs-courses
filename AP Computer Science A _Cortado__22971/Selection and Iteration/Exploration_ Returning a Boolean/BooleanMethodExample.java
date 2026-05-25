public class BooleanMethodExample 
{
    public static void main(String[] args) 
    {
        int number1 = 10;
        int number2 = 5;

        // Call the isGreater method and store the result
        boolean result = isGreater(number1, number2);

        // Print the result
        System.out.println(number1 + " is greater than " + number2 + "? " + result);
    }

    // Method that checks if one number is greater than another
    public static boolean isGreater(int a, int b) 
    {
        return a > b;
    }
}