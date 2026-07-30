import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = input.nextLine();
        Hello hi = new Hello(name);
        
        hi.chinese();
        hi.german();
        hi.english();
    }
}// reviewed: 2026-07-30
