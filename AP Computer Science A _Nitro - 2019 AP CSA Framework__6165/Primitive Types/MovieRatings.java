import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt for the movie rating as a double
        System.out.print("Enter movie rating (as a decimal): ");
        double rating = input.nextDouble();

        // Round the rating to the nearest integer
        int roundedRating = (int) (rating + 0.5);

        // Print the rounded rating
        System.out.println("Rating rounded: " + roundedRating);
       
    }
}// reviewed: 2026-07-23
