public class ControlTower
{
    private String trackedDrones;

    public ControlTower()
    {
        trackedDrones = "";
    }

    // Updates the control tower with the drone's new destination
    public void updateDroneLocation(Drone d)
    {
        System.out.println("Updating destination for Drone " + d.getId());
        trackedDrones += "Drone " + d.getId() + " -> " + d.getDestination() + "\n";
    }

    public String toString()
    {
        return "Currently Tracked Drones:\n" + trackedDrones;
    }
}// reviewed: 2026-05-29
