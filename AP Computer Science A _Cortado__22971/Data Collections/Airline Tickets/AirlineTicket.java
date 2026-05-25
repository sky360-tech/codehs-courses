public class AirlineTicket
{
    // One shared, unchangeable list for the entire class
    private static final String[] SEATS = {"A", "B", "C", "D", "E", "F"};

    // Instance variables for passenger information
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;

    // Constructor initializes all ticket information
     public AirlineTicket(String passengerName, String requestedSeat, int group, int seatRow)
    {
        name = passengerName;
        boardingGroup = group;
        row = seatRow;
        
        // Only assigns if requested seat is valid, otherwise generates new seat
        if (isValidSeat(requestedSeat))
        {
            seat = requestedSeat;
        }
        else // auto-correct the bad input
        {
            int r = (int) (Math.random() * SEATS.length);
            seat = SEATS[r];
        }
    }

    // Helper method to check if a seat letter is valid
    private boolean isValidSeat(String seat)
    {
        for (String elem : SEATS)
        {
            if (seat.equals(elem))
            {
                return true;
            }
        }
        return false;
    }
    
    // Returns a copy of SEATS so that it cannot be changed outside
    // of the class
    public static String[] getSeatLetters()
    {
        String[] copy = new String[SEATS.length];
        for (int i = 0; i < SEATS.length; i++)
        {
            copy[i] = SEATS[i];
        }
        return copy;
    }

    // Returns the seat letter
    public String getSeat()
    {
        return seat;
    }

    // Returns the passenger's name
    public String getName()
    {
        return name;
    }

    // Returns the boarding group number
    public int getBoardingGroup()
    {
        return boardingGroup;
    }

    // Returns the row number
    public int getRow()
    {
        return row;
    }

    // Returns a string representation of the ticket details
    public String toString()
    {
        return name + " Seat: " + seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}