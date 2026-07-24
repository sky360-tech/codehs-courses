import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

        // Prompt for the first test name and score
        System.out.print("Please enter the first test name: ");
        String testName1 = scanner.nextLine();
        System.out.print("Please enter the first test score: ");
        double score1 = scanner.nextDouble();

        // Prompt for the second test name and score
        scanner.nextLine(); // Consume the leftover newline character
        System.out.print("Please enter the second test name: ");
        String testName2 = scanner.nextLine();
        System.out.print("Please enter the second test score: ");
        double score2 = scanner.nextDouble();

        // Prompt for the third test name and score
        scanner.nextLine(); // Consume the leftover newline character
        System.out.print("Please enter the third test name: ");
        String testName3 = scanner.nextLine();
        System.out.print("Please enter the third test score: ");
        double score3 = scanner.nextDouble();

        // Calculate the average score
        double averageScore = (score1 + score2 + score3) / 3;

        // Print the average score
        System.out.println("Your average score is: " + averageScore);
    }
}// reviewed: 2026-07-24
