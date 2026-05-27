public class Car 
{
    private String make;
    private double fuelLevel;
    private double distanceDriven;

    // Constructor
    public Car(String carMake, double startingFuelLevel) 
    {
        make = carMake;
        fuelLevel = startingFuelLevel;
        distanceDriven = 0; // Car starts with no distance driven
    }
    
    // Method to add distance to the car's total distance driven
    public void addDistance(double additionalDistance) 
    {
        distanceDriven += additionalDistance;
    }

    // Accessor method for the car's make
    public String getMake() 
    {
        return make;
    }

    // Accessor method for the car's current fuel level
    public double getFuelLevel() 
    {
        return fuelLevel;
    }

    // Accessor method for the car's total distance driven
    public double getDistanceDriven() 
    {
        return distanceDriven;
    }

    // Mutator method to update the car's fuel level
    public void setFuelLevel(double newFuelLevel) 
    {
        fuelLevel = newFuelLevel;
    }
    

    // Custom toString method
    public String toString() 
    {
        return "Make: " + make + ", Fuel: " + fuelLevel + ", Distance: " + distanceDriven;
    }
}// reviewed: 2026-05-27
