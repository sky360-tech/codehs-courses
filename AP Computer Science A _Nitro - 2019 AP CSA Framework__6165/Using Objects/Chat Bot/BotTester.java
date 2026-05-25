import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name? ");
        String name = input.nextLine();
        Bot hi = new Bot(name);
        
        
        hi.greeting();
        hi.help();
        System.out.println("Tell me Bot, which countries use the imperial system?");
        hi.imperialCountries();
        System.out.println("Tell me Bot, what was the first computer bug?");
        hi.firstBug();
        hi.goodbye();
    }
}