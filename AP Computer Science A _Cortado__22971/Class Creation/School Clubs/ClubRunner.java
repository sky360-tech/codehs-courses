public class ClubRunner 
{
    public static void main(String[] args) 
    {
        // Create Club objects
        Club codingClub = new Club("Coding Club");
        Club dramaClub = new Club("Drama Club");

        // Add members to clubs
        codingClub.addMembers(30);
        dramaClub.addMembers(25);
        System.out.println(codingClub);
        System.out.println(dramaClub);
        
        // Try and add over the maximum number of members
        codingClub.addMembers(15); // Exceeds max, should show a message
        System.out.println(codingClub);

        // Display total number of clubs
        System.out.println("Total Clubs: " + Club.getTotalClubs());
    }
}
