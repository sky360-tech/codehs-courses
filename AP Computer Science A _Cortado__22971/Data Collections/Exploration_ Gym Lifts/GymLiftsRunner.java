public class GymLiftsRunner
{
    public static void main(String[] args)
    {
        GymLifts weights = new GymLifts(183, 90, 220);
        
        Double percent = null;
        weights.printSquatVolumeWorkout(percent);
        
        double lightPercent = 0.50;
        weights.printSquatVolumeWorkout(lightPercent);
        
        double newBench = 100;
        weights.setBench(newBench);
        
        Double newMax = newBench + 5;
        weights.setBench(newMax);
        
        Integer totalWeight = 180;
        System.out.println("\nWeight to add to each side of the barbell: " 
            + weights.computePlateWeight(totalWeight) + " lbs");
    }
}