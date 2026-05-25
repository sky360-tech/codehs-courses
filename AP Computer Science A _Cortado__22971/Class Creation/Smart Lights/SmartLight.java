public class SmartLight
{
    // Instance variables are private to ensure encapsulation
    private boolean isOn;
    private int brightness;
    private String color;
    
    // Constructor must be public so LightRunner can create objects
    public SmartLight(String initialColor, int initialBrightness)
    {
        isOn = false; 
        color = initialColor; 
        brightness = validateBrightness(initialBrightness); 
    }

    // This is a helper method used internally, so it should be private
    private int validateBrightness(int value)
    {
        if (value >= 0 && value <= 100)
        {   
            return value;
        }
        else
        {
            return brightness;
        }
    }
    
    // Actions the user can perform must be public
    public void turnOn()
    {
        isOn = true;
    }
    
    public void turnOff()
    {
        isOn = false;
    }

    // Getters must be public to allow access to the private data
    public boolean getIsOn()
    {
        return isOn;
    }
    
    public int getBrightness()
    {
        return brightness;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Setters must be public to allow the user to change state
    public void setBrightness(int newBrightness)
    {
        brightness = validateBrightness(newBrightness);
    }
    
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    // toString must be public to override the Object class version
    public String toString()
    {
        return "SmartLight [On: " + isOn + ", Brightness: " + brightness + ", Color: " + color + "]";
    }
}