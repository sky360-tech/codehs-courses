public class LightRunner
{
    public static void main(String[] args)
    {
        // Create the new smart light and set initial values
        SmartLight light = new SmartLight("White", 70);
        System.out.println("Initial State:\n" + light);
        
        // Turn on light
        light.turnOn();
        System.out.println("\nAfter turning on:\n" + light);
        
        // Set a new brightness
        light.setBrightness(90);
        System.out.println("\nAfter changing brightness:\n" + light);
        
        // Set a new color
        light.setColor("Blue");
        System.out.println("\nAfter changing color:\n" + light);
        
        // Turn off light
        light.turnOff();
        System.out.println("\nAfter turning off:\n" + light);
    }
}