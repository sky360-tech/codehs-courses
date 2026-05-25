public class Meal
{
    private String name;
    private String meal;
    private int numServings;
    public Meal(String theName, String theMeal, int nS)
    {
    name = theName;
    numServings = nS;
    meal = theMeal;
    }
    public String gettheName()
    {
    return name;
    }
    public void setName(String newName)
    {
    name = newName;
    }
    public String getCourse()
    {
    return meal;
    }
    public int getNumberOfServings()
    {
    return numServings;
    }
    public String toString()
    {
    return name + " (" + meal + ")";
    }
}