public class DragonRunner
{
    public static void main(String[] args)
    {
        // Create new dragon object and print initial info
        Dragon pete = new Dragon("Pete", 80);
        System.out.println("Name: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
        
        // Adjust dragon's name
        System.out.println();
        pete.setName("Peter");
        System.out.println(pete.getName() + " decides to go by his full name.");
        
        // Adjust dragon's level
        pete.setLevel(10);
        System.out.println(pete.getName() + " loses a battle. His level is set to "
                            + pete.getLevel() + ", and he loses his ability to breathe fire.");

        // Print final info
        System.out.println("\nName: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
    }
}// reviewed: 2026-05-29
