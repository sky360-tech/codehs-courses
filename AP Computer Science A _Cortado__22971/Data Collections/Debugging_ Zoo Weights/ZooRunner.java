public class ZooRunner 
{
    public static void main(String[] args) 
    {
        // Create animal group objects
        AnimalGroup animal1 = new AnimalGroup("Elephant", "5000.0", "2");
        AnimalGroup animal2 = new AnimalGroup("Giraffe", "800.5", "3");

        // Create a new Zoo object with two animal groups
        Zoo zoo = new Zoo(animal1, animal2);

        // Print animal details
        zoo.printAnimals();

        // Print total weight of animals in the zoo
        System.out.println("Total weight: " + zoo.calculateTotalWeight() + " kg");
    }
}// reviewed: 2026-06-07
