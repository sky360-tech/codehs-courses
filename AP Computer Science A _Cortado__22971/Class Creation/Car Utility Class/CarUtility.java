public class CarUtility 
{
    /** 
     * Simulates driving a car a specified distance. 
     * Updates the car's fuel level and distance driven 
     * if enough fuel is available.
     * Assumes the car uses 0.05 gallons per mile
     */
    public static void driveCar(Car car, double distance) 
    {
        double fuelNeeded = distance * 0.05;
        if (car.getFuelLevel() >= fuelNeeded) 
        {
            car.setFuelLevel(car.getFuelLevel() - fuelNeeded);
            car.addDistance(distance);
        } 
        else 
        {
            System.out.println("Not enough fuel to drive " + distance + " miles.");
        }
    }

    /**
     * Simulates refueling the car 
     * by adding a specified amount of fuel.
     */
    public static void refuelCar(Car car, double fuel) 
    {
        car.setFuelLevel(car.getFuelLevel() + fuel);
    }
}