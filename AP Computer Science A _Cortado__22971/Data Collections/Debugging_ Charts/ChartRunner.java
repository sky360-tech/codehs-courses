public class ChartRunner
{
    public static void main(String[] args)
    {
        Chart chart1 = new Chart(6, 6);

        System.out.println("Horizontal Numbering:");
        chart1.setHorizontalNumbering();
        chart1.printChart();

        System.out.println("Vertical Numbering:");
        chart1.setVerticalNumbering();
        chart1.printChart();
        
        // Testing a rectangle chart to ensure logic holds
        System.out.println("Rectangle Chart (3 rows, 8 cols) - Horizontal:");
        Chart rectChart = new Chart(3, 8);
        rectChart.setHorizontalNumbering();
        rectChart.printChart();
    }
}