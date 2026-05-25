import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many hours were you parked? ");
        
        int hoursParked = input.nextInt();
        if(hoursParked == 1)
        {
            System.out.println("You owe $7");
        }
        if(hoursParked == 2)
        {
        	System.out.println("You owe $8.50");
        	
        }
        
        if(hoursParked == 3){
            System.out.println("You owe $12.75");
        }
        
        if(hoursParked == 10){
            System.out.println("You owe $31.875");
        }
        
        if(hoursParked == 100){
            System.out.println("You owe $318.75");
        }
        
        
    }
}