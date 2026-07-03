import java.util.Scanner;

public class Intros
{
    public static void main(String[] args)
    {
        // Use System.in here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Please enter your grade: ");
        int grade = input.nextInt();
        
        // This clears the newline character so the next nextLine() works
        input.nextLine();
        
        System.out.print("Please enter a fun fact about yourself: ");
        String fact = input.nextLine();
        
        // Pass the variables to the method
        printIntroduction(name, grade, fact);
    }
    
    public static void printIntroduction(String name, int grade, String fact) 
    {
        System.out.println("\nName: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fun Fact: " + fact);
    }
}// reviewed: 2026-07-03
