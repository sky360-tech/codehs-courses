import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TideTable
{
    // 2D array storing tide heights using the Wrapper class Double
    private Double[][] tideHeights; 

    public TideTable(String filename, int locations)
    {
        tideHeights = new Double[locations][4]; 
        readTideData(filename); 
    }

    private void readTideData(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            int row = 0;

            while (input.hasNextLine() && row < tideHeights.length)
            {
                // 1. Grab one line and split by whitespace
                String line = input.nextLine();
                String[] data = line.split(" ");

                // 2. Traverse the split String array
                for (int col = 0; col < data.length && col < 4; col++)
                {
                    // 3. Handle "null" strings vs actual numbers
                    if (data[col].equals("null"))
                    {
                        tideHeights[row][col] = null;
                    }
                    else
                    {
                        // 4. Parse the String into a Double object
                        tideHeights[row][col] = Double.parseDouble(data[col]);
                    }
                }
                // 5. Move to the next row index for the next line of the file
                row++;
            }

            input.close();
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void printAverageTideHeight(int location)
    {
        // 1. Check if the location is valid (User enters 1-5, index is 0-4)
        int index = location - 1;

        if (index >= 0 && index < tideHeights.length)
        {
            double sum = 0;
            int count = 0;

            // 2. Traverse the specific row for this location
            for (Double height : tideHeights[index])
            {
                // 3. Only process non-null values
                if (height != null)
                {
                    sum += height;
                    count++;
                }
            }

            // 4. Calculate and print average
            if (count > 0)
            {
                double average = sum / count;
                System.out.println("Location's average tide is " + average + "m.");
            }
        }
        else
        {
            System.out.println("Invalid location number.");
        }
    }

    public void printTideData()
    {
        System.out.println("~~ Tide Heights Data ~~");
        for (int row = 0; row < tideHeights.length; row++)
        {
            System.out.print("Location " + (row + 1) + ": | ");
            for (int col = 0; col < tideHeights[row].length; col++)
            {
                if (tideHeights[row][col] != null)
                {
                    System.out.print(tideHeights[row][col] + "m | ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}