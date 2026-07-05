public class CameraRunner 
{
    public static void main(String[] args) 
    {
       // Create at least 3 camera objects and print them out
       
       Camera camera1 = new Camera("35mm", 10);
       Camera camera2 = new Camera(12, 20);
       Camera camera3 = new Camera(24, 3);
       
       System.out.println(camera1);
       System.out.println(camera2);
       System.out.println(camera3);
       
       
    }
}// reviewed: 2026-07-05
