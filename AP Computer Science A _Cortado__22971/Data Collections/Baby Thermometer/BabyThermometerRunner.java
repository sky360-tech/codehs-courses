public class BabyThermometerRunner
{
    public static void main(String[] args)
    {
        BabyThermometer monitor = new BabyThermometer();
        
        // Add valid temperatures
        monitor.addTemperature(100.6);
        monitor.addTemperature(102.3);
        
        // Try to add an invalid temperature
        monitor.addTemperature(107.0);

        // Try replacing last temperature with an invalid value
        monitor.replaceLastTemperature(10.0);

        // Print all temperatures
        System.out.println(monitor);

        // Print most recent temp and total number of temps
        System.out.println("Last Temperature Added: " + monitor.getMostRecentTemperature() + "°F");
        System.out.println("Total Temperatures Recorded: " + monitor.getTemperatureCount());
        
        // Remove last temperature
        monitor.removeLastTemperature();

        // Print final recorded temperatures
        System.out.println(monitor);
    }
}// reviewed: 2026-06-05
