public class Theater
{
    public static void main(String[] args)
    {
        // Create a 10x10 seating chart
        SeatingChart chart = new SeatingChart(10, 10);
        
        // Reserve seats for a few customers
        chart.reserveSeat(0, 1, "Adriana"); 
        chart.reserveSeat(1, 2, "Mayu");
        chart.reserveSeat(6, 8, "Alisa");
        
        // Check for seat availability
        System.out.println(chart.getSeatInfo(0, 1)); 
        System.out.println(chart.getSeatInfo(1, 2)); 
        System.out.println(chart.getSeatInfo(2, 2)); 
    }
}// reviewed: 2026-06-16
