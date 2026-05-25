import java.util.Scanner;

public class MileTimeCheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your mile time in seconds: ");
        int mileTime = input.nextInt();

        if (mileTime < 223)
        {
            System.out.println("Incredible! That's a new world record!");
        }
        else
        {
            System.out.println("Right on! Keep running!");
        }
    }
}