public class RectangleRunner
{
    public static void main(String[] args)
    {
        // Create and print rectangle object
        Rectangle rect1 = new Rectangle(10, 2);
        System.out.println(rect1);

        // Call the instance method calcArea and store area
        int area1 = rect1.calcArea();
        System.out.print("Area of rect1: ");
        System.out.println(area1);

        // Can also just call instance method in print statement
        System.out.print("Perimeter of rect1: ");
        System.out.println(rect1.calcPerimeter());

        // Let's increase dimensions and print results
        rect1.grow(4, 5);
        System.out.println(rect1);
    }
}