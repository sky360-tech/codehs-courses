public class WeatherRecord
{
    // Each record stores the date, temperature, and humidity for one day
    private String date;
    private Integer temperature; 
    private Double humidity;


    // Constructor accepts Strings from data and tries to convert them
    public WeatherRecord(String d, String temp, String hum)
    {
        date = d;

        // If there's a temperature value, convert it to Integer
        if (temp.length() > 0)
        {
            temperature = Integer.parseInt(temp);
        }

        // If there's a humidity value, convert it to Double
        if (hum.length() > 0)
        {
            humidity = Double.parseDouble(hum);
        }
    }

    // Getters to access data from other classes
    public String getDate()
    {
        return date;
    }

    public Integer getTemperature()
    {
        return temperature;
    }

    public Double getHumidity()
    {
        return humidity;
    }
}// reviewed: 2026-06-10
