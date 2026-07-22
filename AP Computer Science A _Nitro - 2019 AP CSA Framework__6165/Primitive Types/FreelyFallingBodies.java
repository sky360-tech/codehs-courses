public class FallingBodies

{

    public static void main(String[] args)

    {
        double time = 23;
        double timeFall = time*time;

        double g = 9.8;
    
        double h = .5*g*timeFall;
    
        double v = g*time;

        System.out.println("The height should be " + h + " meters");

        System.out.println("The velocity of the thing should be " + v);

    }

}// reviewed: 2026-07-22
