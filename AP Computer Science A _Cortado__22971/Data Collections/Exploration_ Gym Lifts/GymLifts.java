public class GymLifts
{
    private double maxSquat;
    private double maxBench;
    private double maxDeadlift;
    
    public GymLifts(double squat, double bench, double deadlift)
    {
        maxSquat = squat;
        maxBench = bench;
        maxDeadlift = deadlift;
    }
    
    public void printSquatVolumeWorkout(Double percentage)
    {
        if (percentage == null)
        {
            System.out.println("Error: No percentage provided!");
        }
        else
        {
            double weight = ((int)(maxSquat * percentage * 100)) / 100.0;
            System.out.println("Squats: 6 sets x 3 reps at " + weight + " lbs");
        }
    }
    
    public int computePlateWeight(Integer weight)
    {
        return (weight - 45) / 2;
    }
    
    public void setBench(double newMax)
    {
        maxBench = newMax;
    }
}