import java.util.Scanner;

public class TrafficEngineer
{
    public static void main(String[] args)
    {
        // Get user input for the distance of the onramp
        Scanner input = new Scanner(System.in);
        double acceleration = 3.0;
        
        // Calculate the time to accelerate down onramp
        System.out.print("Enter the onramp distance (m): ");
        double distance = input.nextDouble();
        double time = calculateTime(acceleration, distance);
        // Print out results
        System.out.println("With a distance of " + distance + "m, the time to accelerate down it is: " + time + "s");
        
    }

    // Calculates and returns the time it takes for an object to accelerate
    // a distance, given the initial velocity of the object is 0
    public static double calculateTime(double acceleration, double distance)
    {
        // Complete this method!
        double time = Math.sqrt(2 * distance / acceleration);
        return time;
    }
}