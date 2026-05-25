public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(10, 5);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
        // Change the width
        box.setWidth(15);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
        // Change the height
        box.setHeight(3);
        System.out.println(box);
        System.out.print("Area: ");
        box.printArea();
        
    }
}