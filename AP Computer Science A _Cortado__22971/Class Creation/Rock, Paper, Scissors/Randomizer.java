public class Randomizer 
{
    public static int nextInt() 
    {
        // Returns a random number from 1-10
        return (int)(Math.random() * (10) + 1);
    }

    public static int nextInt(int min, int max) 
    {
        // Returns a random integer between min and max
        int range = max - min;
        return (int)(Math.random() * (range + 1) + min);
    }
}