public class KiloDistance
{
    // Instance variables
    private double kilometers;
    
    // Constructor
    public KiloDistance(double km)
    {
        kilometers = km;
    }

    // Define the setter method, setKilometers
    public void setKilometers(double km)
    {
        kilometers = km;
    }

    // Define the getter method, getKilometers
    public double getKilometers()
    {
        return kilometers;
    }

    // Define the conversion methods
    
    // toMiles: Divide by 1.609
    public double toMiles()
    {
        return kilometers / 1.609;
    }
    
    // toYards: Multiply by 1,094
    public double toYards()
    {
        return kilometers * 1094.0;
    }
    
    // toLeagues: Divide by 4.828
    public double toLeagues()
    {
        return kilometers / 4.828;
    }
    
    // Custom method: toMeters (Multiply by 1000)
    public double toMeters()
    {
        return kilometers * 1000.0;
    }
    
    // Determine printed output of object
    public String toString()
    {
        return "Distance in kilometers: " + kilometers + " km";
    }
}