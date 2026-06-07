public class Zoo 
{
    private AnimalGroup animal1;
    private AnimalGroup animal2;

    // Constructor stores copies of the animal objects
    public Zoo(AnimalGroup a1, AnimalGroup a2) 
    {
        animal1 = new AnimalGroup(a1.getName(), a1.getWeight(), a1.getQuantity());
        animal2 = new AnimalGroup(a2.getName(), a2.getWeight(), a2.getQuantity());
    }

    // Calculates total weight of animals in the zoo
    public double calculateTotalWeight() 
    {
        double total = 0.0;

        if (animal1 != null) 
        {
            total += Double.parseDouble(animal1.getWeight()) * Integer.parseInt(animal1.getQuantity());
        }

        if (animal2 != null) 
        {
            total += Double.parseDouble(animal2.getWeight()) * Integer.parseInt(animal2.getQuantity());
        }

        return total;
    }

    // Prints details of the animals in the zoo
    public void printAnimals() 
    {
        if (animal1 != null) 
        {
            System.out.println("Animal: " + animal1.getName() + ", Weight: " + animal1.getWeight() + " kg, Quantity: " + animal1.getQuantity());
        }

        if (animal2 != null) 
        {
            System.out.println("Animal: " + animal2.getName() + ", Weight: " + animal2.getWeight() + " kg, Quantity: " + animal2.getQuantity());
        }
    }
}// reviewed: 2026-06-07
