public class DistanceConverter 
{
    public static void main(String[] args) 
    {
        // Distance in kilometers to convert
        double kilometers = 12.5;

        // Convert to miles and display the result
        double miles = convertToMiles(kilometers);
        System.out.print(kilometers);
        System.out.print(" kilometers is ");
        System.out.print(miles);
        System.out.println(" miles.");
    }

    /**
     * Converts a distance from kilometers to miles.
     * Preconditions: input must be a double representing real kilometers.
     * Postconditions: output is a double number representing converted miles.
     * @param kilometers the distance in kilometers
     * @return the equivalent distance in miles
     */
    public static double convertToMiles(double kilometers) 
    {
        return kilometers * 0.621;
    }
}