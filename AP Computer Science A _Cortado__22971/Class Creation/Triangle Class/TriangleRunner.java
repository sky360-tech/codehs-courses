public class TriangleRunner
{
	public static void main(String[] args) 
	{
		Triangle tri1 = new Triangle(3, 5);
		System.out.println(tri1);
		System.out.println("Base: " + tri1.getBase());
		System.out.println("Height: " + tri1.getHeight());
		System.out.println("Area: " + tri1.area());
		
		System.out.println("\n**Updated Triangle**");
		tri1.setBase(5);
		System.out.println(tri1);
		System.out.println("Base: " + tri1.getBase());
		System.out.println("Height: " + tri1.getHeight());
		System.out.println("Area: " + tri1.area());
	}
}
