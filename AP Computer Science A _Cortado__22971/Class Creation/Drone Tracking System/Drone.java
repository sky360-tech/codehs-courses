public class Drone
{
    private String id;
    private String destination;

    public Drone(String id)
    {
        this.id = id;
        this.destination = "None";
    }

    public void assignDestination(ControlTower ct, String destination)
    {
        this.destination = destination;
        ct.updateDroneLocation(this);
    }

    public String getId()
    {
        return this.id;
    }

    public String getDestination()
    {
        return this.destination;
    }

    public String toString()
    {
        return "Drone ID: " + this.id + " | Destination: " + this.destination;
    }
}