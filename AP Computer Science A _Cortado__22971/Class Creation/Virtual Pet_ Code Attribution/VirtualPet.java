public class VirtualPet {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;
    private int hygiene; // Added during adaptation

    /*
     * Constructor: Initializes pet name and sets initial stats using random values.
     * Hunger starts low (0-5), while Happiness, Energy, and Hygiene start high (5-10).
     */
    public VirtualPet(String pName) {
        name = pName;
        hunger = (int)(Math.random() * 6);
        happiness = (int)(Math.random() * 6) + 5;
        energy = (int)(Math.random() * 6) + 5;
        hygiene = (int)(Math.random() * 6) + 5; 
    }

    /*
     * Decreases hunger by a random value (1-3).
     * Ensures hunger does not drop below 0.
     */
    public void feed() {
        hunger -= (int)(Math.random() * 3) + 1;
        if (hunger < 0) { hunger = 0; }
        System.out.println(name + " is fed.");
        checkStatus();
    }

    /*
     * Increases happiness (1-3) but decreases energy (1-2).
     * Caps happiness at 10 and ensures energy does not drop below 0.
     */
    public void play() {
        happiness += (int)(Math.random() * 3) + 1;
        energy -= (int)(Math.random() * 2) + 1;
        if (energy < 0) { energy = 0; }
        if (happiness > 10) { happiness = 10; }
        System.out.println(name + " is playing.");
        checkStatus();
    }

    /*
     * Increases energy by a random value (2-4).
     * Caps energy at 10.
     */
    public void sleep() {
        energy += (int)(Math.random() * 3) + 2;
        if (energy > 10) { energy = 10; }
        System.out.println(name + " is sleeping.");
        checkStatus();
    }

    /*
     * NEW METHOD: Increases hygiene by a random value (3-5).
     * Caps hygiene at 10.
     */
    public void clean() {
        hygiene += (int)(Math.random() * 3) + 3;
        if (hygiene > 10) { hygiene = 10; }
        System.out.println(name + " is now squeaky clean!");
        checkStatus();
    }

    /*
     * Simulates the passage of time. Increases hunger and decreases 
     * happiness, energy, and hygiene by random values (0-2).
     */
    public void passTime() {
        hunger += (int)(Math.random() * 3);
        happiness -= (int)(Math.random() * 3);
        energy -= (int)(Math.random() * 3);
        hygiene -= (int)(Math.random() * 2); // Hygiene drops over time
    }

    /*
     * Checks if any vital stats have reached critical failure points.
     * Returns true if hunger >= 10, or if happiness, energy, or hygiene <= 0.
     */
    public boolean checkRunAway() {
        if (hunger >= 10 || happiness <= 0 || energy <= 0 || hygiene <= 0) {
            System.out.println("Oh no! " + name + " has run away because you didn't take care of them...");
            return true;
        }
        return false;
    }

    /*
     * Prints a visual summary of all current stat levels to the console.
     */
    public void checkStatus() {
        System.out.println("Status:");
        System.out.println("Hunger level: " + hunger);
        System.out.println("Happiness level: " + happiness);
        System.out.println("Energy level: " + energy);
        System.out.println("Hygiene level: " + hygiene);
        System.out.println("**********************");
    }
}