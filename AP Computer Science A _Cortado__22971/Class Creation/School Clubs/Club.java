public class Club 
{
    // Instance variables
    private String clubName;
    private int numMembers;

    // Class variables
    private static int totalClubs = 0;
    private static final int MAX_MEMBERS = 40; 

    // Constructor
    public Club(String name) 
    {
        clubName = name;
        numMembers = 0;
        totalClubs++;
    }
    
    public static int getTotalClubs() 
    {
        return totalClubs;
    }

    /**
     * Adds numMembers to the club
     * Checks to see if numMembers exceeds the maximum number of members
     * Precondition: newMembers > 0
     */
    public void addMembers(int newMembers) 
    {
        if (numMembers + newMembers > MAX_MEMBERS) 
        {
            int notAdded = (numMembers + newMembers) - MAX_MEMBERS;
            numMembers = MAX_MEMBERS;
            System.out.println("Only " + (newMembers - notAdded) + " members were added to the " + clubName + ". " + notAdded + " could not be added as the club is full.");
        } 
        else 
        {
            numMembers = numMembers + newMembers;
        }
    }

    // Accessor and Mutator Methods
    public String getClubName() 
    {
        return clubName;
    }

    public int getNumMembers() 
    {
        return numMembers;
    }

    public void setClubName(String name) 
    {
        clubName = name;
    }

    // toString Method
    public String toString() 
    {
        return "Club: " + clubName + ", Members: " + numMembers;
    }
}
