public class CircleTester {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle myCircle = new Circle(5.0);

        // Use the public getter method to access the radius
        System.out.println("Circle with a radius of " + myCircle.getRadius());


        // Access other methods
        System.out.println("The diameter is " + myCircle.getDiameter());
        System.out.println("The perimeter is " + myCircle.getPerimeter());

      
    }
}