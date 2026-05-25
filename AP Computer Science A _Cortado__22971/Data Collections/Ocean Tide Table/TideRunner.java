public class TideRunner
{
    public static void main(String[] args)
    {
        // Create tide table for 5 locations based on text file
        TideTable table = new TideTable("tide_data.txt", 5);

        // Print the tide table
        table.printTideData();

        // Calculate and print the average tide height for desired location
        table.printAverageTideHeight(4);
    }
}