import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }

    // Task 1: Organize and print by boarding group 1-5
    public void printPassengersByBoardingGroup()
    {
        for (int group = 1; group <= 5; group++)
        {
            System.out.println("Boarding Group " + group + ":");
            for (AirlineTicket t : tickets)
            {
                if (t.getBoardingGroup() == group)
                {
                    System.out.println(t.getName());
                }
            }
        }
    }

    // Task 2: Check if adjacent passengers have the same row and group
    public void canBoardTogether()
    {
        boolean foundMatch = false;

        // Loop to size() - 1 to prevent IndexOutOfBounds when checking i + 1
        for (int i = 0; i < tickets.size() - 1; i++)
        {
            AirlineTicket p1 = tickets.get(i);
            AirlineTicket p2 = tickets.get(i + 1);

            if (p1.getRow() == p2.getRow() && p1.getBoardingGroup() == p2.getBoardingGroup())
            {
                System.out.println(p1.getName() + " can board with " + p2.getName() + ".");
                foundMatch = true;
            }
        }

        if (!foundMatch)
        {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }

    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }
}// reviewed: 2026-06-04
