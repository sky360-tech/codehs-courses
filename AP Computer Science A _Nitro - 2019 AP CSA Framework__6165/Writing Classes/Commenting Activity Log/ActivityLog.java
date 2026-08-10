public class ActivityLog
{
    private double numHours;
    private double numMiles;
    /**.
    
    @param numHours -int to initialize instance variable name for Power object
    @param numMiles - int to initialize instance variable strength for Power object
    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    public double getMiles()
    {
        return numMiles;
    }
    
    public double getHours() 
    {
        return numHours;
    }
    
}// reviewed: 2026-08-10
