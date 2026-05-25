public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
   public Pinata(String pinataCandy, String pinataColor, String pinataShape)
    {
        candy = pinataCandy;
        color = pinataColor;
        shape = pinataShape;
    }
    
   public Pinata(String pinataColor, String pinataShape)
    {
        candy = "hard candy";
        color = pinataColor;
        shape = pinataShape;
    }
    
   public Pinata(String pinataCandy)
    {
        candy = pinataCandy;
        color = "rainbow";
        shape = "donkey";
    }
    
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}