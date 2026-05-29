public class DragonRunner {
    public static void main(String[] args) {
        Dragon pete = new Dragon("Pete", 60);
        
        // Initial state
        System.out.println("Name: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
        System.out.println("Defense rating: " + pete.getDefenseRating());

        // First attack (smoke)
        pete.attack();

        // Level up
        pete.gainExperience(15);
        
        // Second attack (fire)
        pete.attack();

        // Final state
        System.out.println("Name: " + pete.getName());
        System.out.println("Level: " + pete.getLevel());
        System.out.println("Fire breather: " + pete.isFireBreather());
        System.out.println("Defense rating: " + pete.getDefenseRating());
    }
}// reviewed: 2026-05-29
