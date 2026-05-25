import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FitbitAnalysis
{
    public static void main(String[] args)
    {
        int numActiveDays = 0;
        int numInactiveDays = 0;

        try
        {
            File file = new File("ParticipantA.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext())
            {
                String date = input.next();
                int lightlyActive = input.nextInt();
                int fairlyActive = input.nextInt();
                int veryActive = input.nextInt();

                int activeMinutes = fairlyActive + veryActive;

                System.out.println(date + ": " + activeMinutes + " total active minutes.");

                if (activeMinutes >= 30)
                {
                    numActiveDays++;
                }
                else
                {
                    numInactiveDays++;
                }
            }
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }

        // Print Summary
        System.out.println("*********************");
        System.out.println("SUMMARY");
        System.out.println("Number of active days: " + numActiveDays);
        System.out.println("Number of inactive days: " + numInactiveDays);
    }
}