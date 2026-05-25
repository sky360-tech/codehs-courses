public class CarRunner 
{
    public static void main(String[] args) 
    {
        // Create a Car object and print initial state
        Car myCar = new Car("Honda", 10);
        System.out.println(myCar);

        // Drive the car 50 miles and print its state
        CarUtility.driveCar(myCar, 50);
        System.out.println(myCar);

        // Refuel the car and print its state
        CarUtility.refuelCar(myCar, 5);
        System.out.println(myCar);

        // Attempt to drive the car 300 miles and print its state
        CarUtility.driveCar(myCar, 300);
        System.out.println(myCar);
    }
}