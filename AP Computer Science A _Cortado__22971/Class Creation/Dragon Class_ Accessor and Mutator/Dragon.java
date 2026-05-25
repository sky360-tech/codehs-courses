public class Dragon {
    // Instance variables
    private String name;
    private int level;
    private boolean canBreatheFire;

    // Constructor
    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        // Initialize fire breathing based on level
        this.canBreatheFire = level >= 70;
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isFireBreather() {
        return canBreatheFire;
    }

    // Mutator Methods
    public void setName(String newName) {
        name = newName;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
        // Update fire breathing status if level changes
        canBreatheFire = level >= 70;
    }
}