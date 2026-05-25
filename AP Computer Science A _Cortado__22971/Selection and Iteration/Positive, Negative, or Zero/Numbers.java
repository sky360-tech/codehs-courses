import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        
        // First check if num is greater than 0
        if (num > 0)
        {
            System.out.println("The number is positive");
        }
        // If not, then check if num is less than 0
        else if (num < 0)
        {
            System.out.println("The number is negative");
        }
        // If neither of the above are true, num must be zero
        else 
        {
            System.out.println("The number is zero");
        }
    }
}