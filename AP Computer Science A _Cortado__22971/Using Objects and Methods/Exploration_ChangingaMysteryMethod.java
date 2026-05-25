public class MysteryMethodChange
{
    public static void main(String[] args)
    {
        int number = 11;
        
        // Call mysteryMethod and add the returned result back to number
        number = number + mysteryMethod(number);
        
        // Print the final value of number
        System.out.println(number);
    }

    // Changed return type from void to int
    public static int mysteryMethod(int num)
    {
        // Instead of printing, we return the value to the caller
        return num * 15;
    }
}