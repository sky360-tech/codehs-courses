public class CityStats
{
    public static void main(String[] args)
    {
        // Create the 3 arrays here
        String[] cities = {"London", "Marrakesh", "Santa Fe"};
        int[] populations = {8982000, 982850, 89008};
        double[] rainfall = {23.0, 9.5, 14.21};

        // Print all 3 arrays according to the output in the description
        System.out.println(cities[0] + "'s population: " + populations[0]);
        System.out.println(cities[1] + "'s population: " + populations[1]);
        System.out.println(cities[2] + "'s population: " + populations[2]);

        System.out.println();

        System.out.println(cities[0] + " averages " + rainfall[0] + " inches of rain per year.");
        System.out.println(cities[1] + " averages " + rainfall[1] + " inches of rain per year.");
        System.out.println(cities[2] + " averages " + rainfall[2] + " inches of rain per year.");
    }
}// reviewed: 2026-06-06
