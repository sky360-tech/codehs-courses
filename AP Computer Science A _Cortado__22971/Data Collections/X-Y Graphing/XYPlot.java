public class XYPlot
{
    private int[][] plot;

    public XYPlot(int[][] plot)
    {
        this.plot = new int[plot.length][plot[0].length];
        for (int row = 0; row < plot.length; row++)
        {
            for (int col = 0; col < plot[0].length; col++)
            {
                this.plot[row][col] = plot[row][col];
            }
        }
    }

    public boolean hasDuplicates()
    {
        for (int i = 0; i < plot.length; i++)
        {
            for (int j = i + 1; j < plot.length; j++)
            {
                if (plot[i][0] == plot[j][0] && plot[i][1] == plot[j][1])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean allPositive()
    {
        for (int[] point : plot)
        {
            if (point[0] < 0 || point[1] < 0)
            {
                return false;
            }
        }
        return true;
    }

    public void graphCoordinates()
    {
        String[][] graph = {
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
        };

        if (!allPositive())
        {
            System.out.println("Coordinates must be positive in order to graph.");
            return;
        }

        System.out.println();

        for (int[] point : plot)
        {
            int x = point[0];
            int y = point[1];
            if (x >= 0 && x < 10 && y >= 0 && y < 10)
            {
                graph[9 - y][x + 1] = "x";
            }
        }

        for (String[] row : graph)
        {
            for (String cell : row)
            {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}// reviewed: 2026-06-18
