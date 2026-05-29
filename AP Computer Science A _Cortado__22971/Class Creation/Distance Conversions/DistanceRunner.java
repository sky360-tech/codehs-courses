public class DistanceRunner
{
    public static void main(String[] args)   
    {
        // Create new kilo distance object 
        KiloDistance kiloToSchool = new KiloDistance(5);
        
        // Convert to miles and leagues and print
        double milesToSchool = kiloToSchool.toMiles();
        double leaguesToSchool = kiloToSchool.toLeagues();
        
        System.out.println(kiloToSchool);
        System.out.println("= " + milesToSchool + " mi");
        System.out.println("= " + leaguesToSchool + " leagues\n");

        // Set new kilo distance
        kiloToSchool.setKilometers(1.5);
        
        // Convert new distance to yards and print
        double yardsToSchool = kiloToSchool.toYards();

        System.out.println(kiloToSchool);
        System.out.println("= " + yardsToSchool + " yd");
        
        // Convert new distance to your custom unit (Meters) and print:
        double metersToSchool = kiloToSchool.toMeters();
        System.out.println("= " + metersToSchool + " m");
    }
}// reviewed: 2026-05-29
