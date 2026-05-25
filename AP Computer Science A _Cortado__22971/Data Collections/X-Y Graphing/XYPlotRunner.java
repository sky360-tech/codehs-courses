public class XYPlotRunner
{
    public static void main(String[] args)
    {
        int[][] plot1 = {
            {1, 2},
            {2, 4},
            {3, 3},
            {2, 4},
            {5, 7},
            {6, 6},
            {7, 8},
            {8, 6},
            {9, 9},
            {10, 10}
        };

        XYPlot grapher = new XYPlot(plot1);

        System.out.println("Has duplicates: " + grapher.hasDuplicates());
        System.out.println("All positive coordinates: " + grapher.allPositive());

        grapher.graphCoordinates();
    }
}