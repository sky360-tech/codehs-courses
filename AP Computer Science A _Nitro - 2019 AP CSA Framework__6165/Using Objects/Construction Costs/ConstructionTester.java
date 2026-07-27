import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the sales tax rate: ");
       double tax = input.nextDouble();
       System.out.println("How many boards do you need? ");
       int boards = input.nextInt();
       System.out.println("How many windows do you need? ");
       int windows = input.nextInt();
       Construction total = new Construction(8.0, 11.0, tax);
       double boardCost= total.lumberCost(boards);
       double windCost = total.windowCost(windows);
       double subTotal = boardCost + windCost;
       System.out.print("Total: ");
       System.out.println(subTotal);
       double grand = total.grandTotal(subTotal);
       System.out.print("Grand Total: ");
       System.out.println(grand);
    }
}// reviewed: 2026-07-27
