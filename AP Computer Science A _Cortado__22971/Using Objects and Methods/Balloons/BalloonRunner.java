public class BalloonRunner 
{
    public static void main(String[] args) 
    {
        // Create two balloon objects
        Balloon b1 = new Balloon(5.0, "red");
        Balloon b2 = new Balloon(12.5, "blue");
        
        // Print out initial information of each balloon
        System.out.println("Initial State:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(); // Just for spacing

        // Inflate first balloon by 10cm
        b1.inflate(10.0);
        
        // Change the color of second balloon to silver
        b2.changeColor("silver");

        // Print out final information of each balloon
        System.out.println("Final State:");
        System.out.println(b1);
        System.out.println(b2);
    }
}// reviewed: 2026-06-26
