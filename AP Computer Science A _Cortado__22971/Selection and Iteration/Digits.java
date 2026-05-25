public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
    }
    
    public static void extractDigits(int num)
    {
        // Use a while loop to process the number until no digits are left
        while (num > 0)
        {
            // 1. Get the last digit using modulus
            int lastDigit = num % 10;
            
            // 2. Print the digit
            System.out.println(lastDigit);
            
            // 3. Remove the last digit using integer division
            num = num / 10;
        }
    }
}