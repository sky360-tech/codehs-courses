public class Voyager
{
    public static void main(String[] args)
    {
        //String reference variables to store textual mission data
        String missionName = "Voyager 1";
        String missionPurpose = "explore the outermost edge of the Sun's domain and beyond";
        
        // Primitive variables to store mission data
        int launchYear = 1977;
        double distanceFromEarth = 165.9;
        boolean missionInProgress = true;
        char cameraStatus = 'O'; //(W) for working and (O) for off 
        
        // Print out mission details
        System.out.println("Mission Name: ");
        System.out.println(missionName);
        System.out.println("Mission Purpose: ");
        System.out.println(missionPurpose);
        System.out.println("Mission Launch Year: ");
        System.out.println(launchYear);
        System.out.println("Distance Traveled (in astronomical units)");
        System.out.println(distanceFromEarth);
        System.out.println("Is the mission still in progress? ");
        System.out.println(missionInProgress);
        System.out.println("Camera status: ");
        System.out.println(cameraStatus);
    }
}