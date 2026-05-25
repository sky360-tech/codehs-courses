import java.util.ArrayList;

public class AirlineTicketRunner
{
    public static void main(String[] args)
    {
        // Create an ArrayList to store AirlineTicket objects
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();

        // Add randomized passengers to the tickets list
        addPassengers(tickets);

        // Display the list of all passengers with their seat, row, and boarding group
        System.out.println("Passengers in Line:");
        for (AirlineTicket elem : tickets)
        {
            System.out.println(elem);
        }

        // Create a TicketOrganizer object to manage boarding logic
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);

        // Display passengers grouped by boarding group
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();

        // Check if any passengers in line can board together
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }

    // Adds 15 randomized AirlineTicket objects to the list.
    // Each passenger is assigned a random seat, row, and boarding group.
    public static void addPassengers(ArrayList<AirlineTicket> ticketList)
    {
        // Retrieve a COPY of the valid seat letters from AirlineTicket
        String[] seats = AirlineTicket.getSeatLetters();
    
        for (int i = 0; i < 15; i++)
        {
            int randomIndex = (int) (Math.random() * seats.length);
            String seatLetter = seats[randomIndex];
    
            AirlineTicket ticket = new AirlineTicket(
                "Passenger " + (i + 1),
                seatLetter,
                (int) (Math.random() * 5) + 1,   // Boarding group 1‒5
                (int) (Math.random() * 8) + 1    // Row 1‒8
            );
    
            ticketList.add(ticket);
        }
    }
}