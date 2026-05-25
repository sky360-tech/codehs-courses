import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your goal:");
        int goal = userInput.nextInt();
        System.out.println("Enter your actual amount: ");
        int actualAmount = userInput.nextInt();
        // Check if age is greater than or equal to 18
        boolean wentOverGoal = actualAmount > goal;
        boolean goalMet = actualAmount < goal;
        boolean metGoalExactly = actualAmount >= goal;


        
        System.out.println("Went over goal? " + wentOverGoal);
        System.out.println("Did not meet goal? " + goalMet);
        System.out.println("Met goal exactly? " + metGoalExactly);

        
    }
}