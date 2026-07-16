import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Start by making comments to outline the logic of your program
        
        int fastestSpeed = scanner.nextInt();
        
        if(fastestSpeed < 223){
            
            System.out.println("Are you sure? That's a new world record!");
            
        }
        
        if(fastestSpeed >= 223){
            
            System.out.println("Right on! Keep running!");
 
        }
    }
}// reviewed: 2026-07-16
