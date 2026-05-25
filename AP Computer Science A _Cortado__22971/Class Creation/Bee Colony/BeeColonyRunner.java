public class BeeColonyRunner {
    public static void main(String[] args) {
        // Creating Bee Colonies
        BeeColony colony1 = new BeeColony("Sunflower Hive", 5000); 
        BeeColony colony2 = new BeeColony("Golden Meadow", 3500); 

        // Printing colony details
        System.out.println(colony1);
        System.out.println(colony2);

        // Produce honey
        colony1.produceHoney();
        colony2.produceHoney();
        System.out.println();

        // New tester code:
        System.out.println("Total Colonies Created: " + BeeColony.getTotalColonies());
        
        // Compare the two colonies
        System.out.println(BeeColony.compareColonies(colony1, colony2));
        
        // Print total honey produced across all colonies
        System.out.println("Total Honey Produced Across All Colonies: " + BeeColony.getTotalHoneyProduced() + " honeycombs");
    }
}