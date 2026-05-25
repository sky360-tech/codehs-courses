public class Dog
{
    // Add your three private instance variables here:
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here:
    
    // First constructor: All three parameters
    public Dog(String name, String breed, boolean hasShots)
    {
        this.name = name;
        this.breed = breed;
        this.hasShots = hasShots;
    }
    
    // Second constructor: Name and breed only (hasShots defaults to false)
    public Dog(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
        this.hasShots = false;
    }
    
    // Prints out dog information
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots\n";
        }
        else
        {
            output += "\nMissing shots\n";
        }
        
        return output;
    }
}