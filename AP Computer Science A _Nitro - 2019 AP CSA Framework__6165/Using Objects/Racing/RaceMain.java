public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        Racecar brett = new Racecar(Math.random() * 100.0 + 1, "Dave");
        Racecar jules = new Racecar(Math.random() *100.0 + 1, "Jules");
        
        // Create two Racecar objects
        
        // Compute the finishing times for both cars
        double brettTime = brett.computeTime(distance);
        double julesTime = jules.computeTime(distance);
        
        // Print times of each car
        System.out.println("First car finished in " + Math.min(brettTime, julesTime) + " seconds");
        System.out.println("First car finished in " + Math.max(brettTime, julesTime) + " seconds");

    }
}