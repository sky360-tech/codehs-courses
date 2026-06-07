public class Chart
{
    private int[][] chart;

    public Chart(int rows, int cols)
    {
        chart = new int[rows][cols];
    }

    // FIX: Changed <= to < and used correct length for the row loop
    public void setHorizontalNumbering()
    {
        for (int row = 0; row < chart.length; row++)
        {
            for (int col = 0; col < chart[row].length; col++)
            {
                chart[row][col] = col;
            }
        }
    }

    // FIX: Assigned 'row' to the cell instead of 'col' to make numbers increase downward
    public void setVerticalNumbering()
    {
        for (int col = 0; col < chart[0].length; col++)
        {
            for (int row = 0; row < chart.length; row++)
            {
                chart[row][col] = row;
            }
        }
    }

    public void printChart()
    {
        for (int[] row : chart)
        {
            for (int cell : row)
            {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}// reviewed: 2026-06-07
