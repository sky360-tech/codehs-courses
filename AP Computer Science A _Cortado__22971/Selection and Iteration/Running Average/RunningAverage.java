import java.util.Scanner;
 
public class RunningAverage
{
    public static void main(String[] args)
    {       
        // Compute averages based on user input
        double averageTime = computeAverage();

        // Print results
        if (averageTime > 0)
        {
            System.out.println("Average 100 meter sprint time: " + averageTime + " seconds.");
        }
        else 
        {
            System.out.println("You didn't enter any times!");
        }
    }
        
    // Collects race times and returns an average
    public static double computeAverage()
    {
        // Define a TERMINATE value that will signal
        // the end of user input, which is another way to end a while loop!
        final double TERMINATE = -1;
        Scanner input  = new Scanner(System.in);

        // Initialize variables to track the 100 meter sprint times
        int myNumInputs = 0;
        double myTotalTime = 0;
        
        // Loop to continually prompt the user for more input
        while (true)
        {
            // Input a new 100 meter sprint time
            System.out.println("Input your 100 meter sprint time in seconds (-1 to stop): ");
            double time = input.nextDouble();
            
            // If user inputs the TERMINATE value, end the loop
            if (time == TERMINATE)
            {
                break;    
            }

            // Validate input: only positive times are accepted
            if (time > 0)
            {
                // Update the variables to include the new running time
                myNumInputs++;
                myTotalTime += time;
            }
            else
            {
                System.out.println("Invalid input. Enter a positive time or -1 to stop.");
            }
        }
        
        // Compute and return the average running time
        if (myNumInputs > 0)
        {
            return myTotalTime / myNumInputs;
        }
        else 
        {
            return 0;
        }
    }
}// reviewed: 2026-06-24
