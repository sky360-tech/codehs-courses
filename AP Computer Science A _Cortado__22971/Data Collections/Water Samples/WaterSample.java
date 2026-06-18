public class WaterSample
{
    // Instance variable
    double[] pHLevels;

    // Constructor initializes an array for 4 pH readings 
    // (morning, noon, evening, night)
    public WaterSample()
    {
        pHLevels = new double[4];
    }

    // Set a pH value at a specific time slot
    public void setPHLevel(int index, double value)
    {
        if (index >= 0 && index < pHLevels.length)
            pHLevels[index] = value;
        else
            System.out.println("Invalid index.");
    }

    // Get a pH value from a specific time slot
    public double getPHLevel(int index)
    {
        if (index >= 0 && index < pHLevels.length)
            return pHLevels[index];
        else
            return -1;
    }

    // Print all pH values in array
    public String toString()
    {
        return "Morning pH: " + pHLevels[0]
            + "\nNoon pH: " + pHLevels[1]
            + "\nEvening pH: " + pHLevels[2]
            + "\nNight pH: " + pHLevels[3];
    }
}// reviewed: 2026-06-18
