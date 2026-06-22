import java.util.Scanner;

public class DonationCollection
{
    public static void main(String[] args)
    {
        // Collect leftover cans to be donated
        int leftoverCans = collectDonations();

        System.out.println("There are " + leftoverCans + " leftover cans that can be donated.");
    }

    // Collects total cans from all crates and returns the number of leftovers
    // that do not fit into complete boxes
    public static int collectDonations()
    {
    Scanner input = new Scanner(System.in);

    // 1. Change constant to 15
    final int NUM_CANS_PER_BOX = 15;

    // 2. Ask the user for the number of crates
    System.out.println("How many crates are being delivered this week?");
    int numCrates = input.nextInt();

    int totalCans = 0;

    // 3. Use the user's input for the loop limit
    for (int i = 1; i <= numCrates; i++)
    {
        System.out.println("Number of cans in crate #" + i + ":");
        int cans = input.nextInt();
        totalCans += cans;
    }

    // Calculate leftovers using the new box size
    int leftovers = totalCans % NUM_CANS_PER_BOX;

    return leftovers;
    }
}// reviewed: 2026-06-22
