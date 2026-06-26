public class Balloon 
{
    private double radius; 
    private String color; 
    
    public Balloon(double initialRadius, String balloonColor) 
    {
        radius = initialRadius;
        color = balloonColor;
    }
    
    // Instance method to inflate the balloon
    public void inflate(double amount) 
    {
        // Add the amount to the current radius
        radius += amount;
    }
    
    public void changeColor(String newColor) 
    {
        color = newColor;
    }
    
    public String toString()
    {
        return "This balloon is " + color + " and has a radius of " + radius + "cm.";
    }
}// reviewed: 2026-06-26
