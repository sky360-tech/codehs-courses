public class WaterSampleRunner
{
    public static void main(String[] args)
    {
        WaterSample sample = new WaterSample();

        // Assigning pH values manually
        sample.setPHLevel(0, 6.8);  // Morning
        sample.setPHLevel(1, 7.2);  // Noon
        sample.setPHLevel(2, 7.0);  // Evening
        sample.setPHLevel(3, 6.9);  // Night

        // Retrieving and printing single pH value
        System.out.println("Morning pH: " + sample.getPHLevel(0));
        
        // Printing out all of the pHs in the sample
        System.out.println("\n" + sample + "\n");

        // Try setting a value with an invalid index
        sample.setPHLevel(4, 6.8);
    }
}// reviewed: 2026-06-18
