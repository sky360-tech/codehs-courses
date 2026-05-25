public class Car
{
    // Variables for attributes
    private String model;
    private String color;
    private int speed;

    // Sets the values of the attributes when a car 
    // object is created (known as the Constructor)
    public Car(String carModel, String carColor, int carSpeed)
    {
        model = carModel;
        color = carColor;
        speed = carSpeed;
    }

    /** 
    * Below are the list of "instance" methods for this class.
    * You'll learn more about defining and using them in 
    * other lessons. For now, just know that they are similar
    * to class methods, and that the toString() method allows
    * you to print information about the object in the standard
    * System.out.println() statement, as shown in the
    * CarRunner class.
    */

    // Returns the current speed of the car
    public int getSpeed()
    {
        return speed;
    }

    // Increases the car's speed by the specified amount
    public void accelerate(int increase)
    {
        speed = speed + increase;
    }

    // Changes the car's color to a new one
    public void changeColor(String newColor)
    {
        color = newColor;
    }

    // Method that is called when a car object is printed
    public String toString()
    {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " mph";
    }
}