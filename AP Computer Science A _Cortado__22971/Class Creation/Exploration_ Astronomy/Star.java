public class Star
{
    private String name;
    private double luminosity;

    public Star(String starName, double starLuminosity)
    {
        name = starName;
        luminosity = starLuminosity;
    }

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    public double getLuminosity() { return luminosity; }
    public void setLuminosity(double newLuminosity) { luminosity = newLuminosity; }

    public String toString()
    {
        return "Star [name = " + name + ", luminosity = " + luminosity + "]";
    }
}