public class DroneRunner
{
    public static void main(String[] args)
    {
        ControlTower tower = new ControlTower();

        Drone drone1 = new Drone("A1");
        Drone drone2 = new Drone("B7");
        Drone drone3 = new Drone("C9");

        drone1.assignDestination(tower, "Warehouse 17");
        drone2.assignDestination(tower, "Delivery Zone");
        drone3.assignDestination(tower, "Warehouse 6");

        System.out.println("\n" + tower);
    }
}