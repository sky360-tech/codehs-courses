import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount
{
    public static void main(String[] args)
    {
        try
        {
            // File and Scanner setup
            File file = new File("ShakeItOff.txt");
            Scanner input = new Scanner(file);

            // Initialize counters and target words
            int numShakes = 0;
            int numYou = 0;
            String targetShake = "shake";
            String targetYou = "you";

            // Process each line of the file
            while (input.hasNext())
            {
                String line = input.nextLine().toLowerCase(); // ignore capitalization

                String[] arrayLine = line.split(" ");
                for (String word : arrayLine)
                {
                    if (word != null && word.equals(targetShake))
                    {
                        numShakes++;
                    }
                    if (word != null && word.equals(targetYou))
                    {
                        numYou++;
                    }
                }
            }

            // Clean up and output results
            input.close();
            System.out.println("Number of shakes: " + numShakes);
            System.out.println("Number of yous: " + numYou);
        }
        catch (IOException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}// reviewed: 2026-06-10
