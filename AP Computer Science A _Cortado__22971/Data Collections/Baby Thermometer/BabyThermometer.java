import java.util.ArrayList;

public class BabyThermometer
{
    private ArrayList<Double> temperatures;

    public BabyThermometer()
    {
        temperatures = new ArrayList<Double>();
    }

    public void addTemperature(Double temp)
    {
        if (temp >= 95.0 && temp <= 105.0) {
            temperatures.add(temp);
            System.out.println("Adding temperature: " + temp + "°F");
        } else {
            System.out.println(temp + "°F is outside valid range and was not added.");
        }
    }

    public void removeLastTemperature()
    {
        if (temperatures.size() > 0) {
            // Remove the element at the last index
            Double removed = temperatures.remove(temperatures.size() - 1);
            System.out.println("Removed temperature: " + removed + "°F");
        } else {
            System.out.println("There are no temperatures recorded.");
        }
    }

    public void replaceLastTemperature(Double newTemp)
    {
        if (temperatures.size() == 0) {
            System.out.println("No temperatures to replace.");
        } else if (newTemp < 95.0 || newTemp > 105.0) {
            System.out.println(newTemp + "°F is outside valid range and was not used.");
        } else {
            temperatures.set(temperatures.size() - 1, newTemp);
            System.out.println("Last temperature replaced with: " + newTemp + "°F");
        }
    }

    public Double getMostRecentTemperature()
    {
        if (temperatures.size() > 0) {
            return temperatures.get(temperatures.size() - 1);
        } else {
            System.out.println("No temperatures recorded.");
            return 0.0;
        }
    }

    public int getTemperatureCount()
    {
        return temperatures.size();
    }
    
    public String toString()
    {
        String temps = "";
        for (Double t : temperatures)
        {
            temps += t + "°F\n";
        }
        return "\nRecorded Temperatures:\n" + temps;
    }
}