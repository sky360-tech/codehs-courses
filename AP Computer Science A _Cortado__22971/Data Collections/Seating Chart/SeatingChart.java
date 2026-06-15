public class SeatingChart
{
    // Instance variable: 2D array of Strings
    private String[][] seats;

    public SeatingChart(int rowCount, int colCount)
    {
        // Allocate memory using parameters
        seats = new String[rowCount][colCount];
    }

    // Reserves seat with name if it is available
    public void reserveSeat(int row, int col, String name)
    {
        // Extension: Validate bounds
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length)
        {
            // Check if available (null)
            if (seats[row][col] == null)
            {
                seats[row][col] = name;
            }
            else
            {
                System.out.println("Seat already reserved.");
            }
        }
    }

    // Returns information about the seat availability
    public String getSeatInfo(int row, int col)
    {
        // Extension: Validate bounds
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length)
        {
            return "Invalid seat coordinates.";
        }

        if (seats[row][col] == null)
        {
            return "Seat is available.";
        }
        else
        {
            return "Seat is reserved by " + seats[row][col] + ".";
        }
    }

    // Optional Extension: cancel a reservation
    public void cancelReservation(int row, int col)
    {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length)
        {
            seats[row][col] = null; // Reset to available
        }
    }
}// reviewed: 2026-06-15
