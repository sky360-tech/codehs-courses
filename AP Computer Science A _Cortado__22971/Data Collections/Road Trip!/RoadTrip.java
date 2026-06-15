import java.util.ArrayList;

public class RoadTrip
{
    // Add instance variable to store the list of GeoLocations
    private ArrayList<GeoLocation> stops;

    // Constructor initializes the ArrayList
    public RoadTrip()
    {
        stops = new ArrayList<GeoLocation>();
    }

    // Creates a GeoLocation and adds it to the list
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation newStop = new GeoLocation(name, latitude, longitude);
        stops.add(newStop);
    }

    // Returns the number of locations in the trip
    public int getNumberOfStops()
    {
        return stops.size();
    }

    // Returns the total distance of the trip
    public double getTripLength()
    {
        double totalDistance = 0;
        for (int i = 0; i < stops.size() - 1; i++)
        {
            GeoLocation current = stops.get(i);
            GeoLocation next = stops.get(i + 1);
            totalDistance += current.distanceFrom(next);
        }
        return totalDistance;
    }

    // Returns a numbered list of all stops
    public String toString()
    {
        String output = "";
        for (int i = 0; i < stops.size(); i++)
        {
            output += (i + 1) + ". " + stops.get(i).toString() + "\n";
        }
        return output;
    }
}// reviewed: 2026-06-15
