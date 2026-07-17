import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many points did you score? ");
        int pointsScored = userInput.nextInt();
        System.out.println("How many rebounds did you get? ");
        int reboundsDone = userInput.nextInt();
        System.out.println("How many assists did you have? ");
        int AssistsDone = userInput.nextInt();
        boolean rebounds = reboundsDone >= 10;
        boolean points = pointsScored >= 10;
        boolean assists = AssistsDone >= 10;


        
        System.out.println("You got 10 or more points: " + points);
        System.out.println("You got 10 or more rebounds:  " + rebounds);
        System.out.println("You got 10 or more assists:  " + assists);

        
        
    }
}// reviewed: 2026-07-17
