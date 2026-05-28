public class CircleRunner 
{
    public static void main(String[] args) 
    {
        Circle circ = new Circle(10);

        // Use the setter method instead of direct access
        circ.setRadius(5.0);
        
        System.out.println(circ);

        System.out.println("The diameter is " + circ.getDiameter());
        System.out.println("The perimeter is " + circ.getPerimeter());
    }
}// reviewed: 2026-05-28
