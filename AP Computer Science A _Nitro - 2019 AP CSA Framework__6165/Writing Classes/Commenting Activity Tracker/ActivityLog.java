public class ActivityLog
{
    private double numHours;
    private double numMiles;
    // tracking the activity
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    // adding hours to the list 
    public void addHours(double hours)
    {
        numHours += hours;
    }
    // adding miles to the list
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    // getting the amount of miles the user ran
    public double getMiles()
    {
        return numMiles;
    }
    // getting the amount of hours the user ran
    public double getHours() 
    {
        return numHours;
    }
    
}// reviewed: 2026-08-10
