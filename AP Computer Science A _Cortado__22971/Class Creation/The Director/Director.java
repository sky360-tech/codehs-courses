// Director.java
public class Director
{
    private String name;
    private int yearsExperience;

    public Director(String name, int yearsExperience)
    {
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public void setName(String newName) { name = newName; }
    public void setYearsExperience(int newYears) { yearsExperience = newYears; }
    public String getName() { return name; }
    public int getYearsExperience() { return yearsExperience; }
    public String toString() { return name + " (" + yearsExperience + " years experience)"; }
}