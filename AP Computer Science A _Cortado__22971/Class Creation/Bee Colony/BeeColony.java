public class BeeColony {
    // Class Variables
    private static final int OPTIMAL_WORKERS = 5000;
    
    // Added class variables
    private static int totalColonies = 0;
    private static double totalHoneyProduced = 0.0;

    // Instance Variables
    private String colonyName;
    private int workerBees;
    private double efficiency;

    // Constructor
    public BeeColony(String name, int workers) {
        colonyName = name;
        workerBees = workers;
        efficiency = Math.min((double) workerBees / OPTIMAL_WORKERS, 1.0); 
        
        // Increase colony count
        totalColonies++;
    }

    // Class methods
    public static int getTotalColonies() {
        return totalColonies;
    }

    public static double getTotalHoneyProduced() {
        return totalHoneyProduced;
    }

    public static String compareColonies(BeeColony c1, BeeColony c2) {
        double prod1 = c1.calculateHoneyProduction();
        double prod2 = c2.calculateHoneyProduction();
        
        if (prod1 > prod2) {
            return c1.getColonyName() + " produces more honey.";
        } else if (prod2 > prod1) {
            return c2.getColonyName() + " produces more honey.";
        } else {
            return "Both colonies produce the same amount of honey.";
        }
    }

    // ~~ Instance Methods ~~
    public double calculateHoneyProduction() {
        return workerBees * efficiency * 2;
    }

    public void produceHoney() {
        double production = calculateHoneyProduction();
        totalHoneyProduced += production;
        System.out.println(colonyName + " produced " + production + " honeycombs.");
    }

    public String getColonyName() { return colonyName; }
    public int getWorkerBees() { return workerBees; }
    public double getEfficiency() { return efficiency; }

    public String toString() {
        return "Colony Name: " + colonyName + "\n" +
               "Worker Bees: " + workerBees + "\n" +
               "Efficiency: " + (efficiency * 100) + "%\n" +
               "Estimated Honey Production: " + calculateHoneyProduction() + " honeycombs\n";
    }
}