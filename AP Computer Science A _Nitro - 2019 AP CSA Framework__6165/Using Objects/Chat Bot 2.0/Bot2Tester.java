import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
       Scanner input = new Scanner(System.in);
       System.out.println("Hello! What is your name? ");
       String name = input.nextLine();
       Bot2 bot = new Bot2(name);
       bot.greeting();
       System.out.println("What is your favorite animal? ");
       String a = input.nextLine();
       bot.favoriteAnimal(a);
       System.out.println("If you could visit any place, where would you go? ");
       String h = input.nextLine();
       bot.destination(h);
       
       System.out.println("What is your favorite number? ");
       
       int n = input.nextInt();           // Reads an integer input
       bot.favoriteNumber(n);
       bot.goodbye();
       
    }
}