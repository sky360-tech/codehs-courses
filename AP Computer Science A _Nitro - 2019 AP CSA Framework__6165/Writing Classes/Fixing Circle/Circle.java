public class Circle {

    private double radius; // Make radius private for encapsulation

    public Circle(double myRadius) { // Make constructor public so objects can be created outside the class
        radius = myRadius;
    }

    public void setRadius(double myRadius) { // Make setRadius public to modify the radius outside the class
        radius = myRadius;
    }

    public double getDiameter() { // Make getDiameter public so it can be accessed
        return radius * 2;
    }

    public double getRadius() { // Getter for radius, which is private now
        return radius;
    }

    public double getPerimeter() { // Make getPerimeter public to access from outside the class
        return Math.PI * getDiameter();
    }

    @Override
    public String toString() { // Make toString public so it can be used to print the circle's details
        return "Circle with a radius of " + radius;
    }
}// reviewed: 2026-08-11
