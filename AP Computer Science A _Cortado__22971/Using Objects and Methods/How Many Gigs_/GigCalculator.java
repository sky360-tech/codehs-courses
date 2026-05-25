public class GigCalculator
{
    public static void main(String args[])
    {
        int numPicsPerWeekday = 15;
        int numPicsPerWeekendDay = 50;
        int numPicsPerGig = 600;
        
        System.out.print("Number of pictures per week: ");
        System.out.println(numPicsPerWeekday * 5 + numPicsPerWeekendDay * 2);
        
        System.out.print("Number of pictures per year: ");
        System.out.println((numPicsPerWeekday * 5 + numPicsPerWeekendDay * 2) * 52);
        
        System.out.print("Number of gigs needed for a year (int division): ");
        System.out.println((numPicsPerWeekday * 5 + numPicsPerWeekendDay * 2) * 52 / numPicsPerGig);
        
        System.out.print("Number of gigs needed for a year (double division): ");
        System.out.println((numPicsPerWeekday * 5 + numPicsPerWeekendDay * 2) * 52.0 / numPicsPerGig);
        
        System.out.print("Leftover pics that wouldn't be saved: ");
        System.out.println((numPicsPerWeekday * 5 + numPicsPerWeekendDay * 2) * 52 % numPicsPerGig);
    }
}