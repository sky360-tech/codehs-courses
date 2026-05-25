public class BaseballPlayer
{
    private String name;
    private int hits;
    private int atBats;
    
    // Constructor added here
    public BaseballPlayer(String name, int hits, int atBats)
    {
        this.name = name;
        this.hits = hits;
        this.atBats = atBats;
    }
    
    public double battingAverage()
    {
        // Hits are divided by atBats; (double) prevents integer division
        return hits / (double) atBats;
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
}