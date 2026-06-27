import java.util.Scanner;

public class Banking101
{
    public static void main(String[] args)
    {   
        // Write your code here
        Scanner input = new Scanner(System.in);
        double interestRate = 0.03;
        System.out.println("Please enter an initial balance: ");
        double balance = input.nextDouble();
        System.out.println("Initial balance: $" + balance);
        balance *= (1 + interestRate);
        System.out.println("Balance after interest: $" + balance);
        System.out.println("Please enter a deposit amount: ");
        double deposit = input.nextDouble();
        balance += deposit;
        balance *= (1 + interestRate);
        System.out.println("Final balance after interest: $" + balance);
    }
}// reviewed: 2026-06-27
