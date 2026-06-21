public class Lighting
{
    public static void main(String[] args)
    {
        boolean lightOn = false;
        lightOn = flipSwitch(lightOn);
        strobeLight(lightOn);
    }
    
    // Flips the value of light, prints new value, and returns value
    public static boolean flipSwitch(boolean light)
    {
        light = !light;
        if (light)
        {
            System.out.println("Light on");
        }
        else
        {
            System.out.println("Light off");
        }
        return light;
    }
    
    // Flips the light value many times to simulate a strobe light
    public static void strobeLight(boolean light)
    {
        System.out.println("STROBE LIGHT!!!!");
        int num = 0;
        while (num < 50)
        {
            light = flipSwitch(light);
            num++;
        }
    }
    
    // Flips the light value 5 times as a warning
    public static void warningLight(boolean light)
    {
        // Complete this method as part of the Modify section
    }
}// reviewed: 2026-06-21
