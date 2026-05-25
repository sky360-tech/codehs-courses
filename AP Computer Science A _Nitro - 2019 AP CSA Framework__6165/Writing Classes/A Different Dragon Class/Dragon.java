public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String _name, int _level)

    {

    this.level = _level;

    this.name = _name;

    this.canBreatheFire = level >= 70;
    
    }

    public String getName()

    {

    return this.name;

    }

    public int getLevel()

    {

    return this.level;

    }

    public boolean isFireBreather()

    {

    return this.canBreatheFire;

    }

    public void attack()

    {

    System.out.println(canBreatheFire ? ">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>" : "~ ~ ~");

    }

    public void gainExperience()

    {
    
    this.canBreatheFire = (level += 10) >= 70;
    
    }
    // Put getters here
    
    // Put other methods here
    

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}