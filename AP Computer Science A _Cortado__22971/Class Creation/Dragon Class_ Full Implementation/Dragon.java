public class Dragon {
    private String name;
    private int level;
    private boolean canBreatheFire;

    // Constructor from previous exercise
    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        this.canBreatheFire = level >= 70;
    }

    // Accessor Methods
    public String getName() { return name; }
    public int getLevel() { return level; }
    public boolean isFireBreather() { return canBreatheFire; }

    // Mutator Methods
    public void gainExperience(int levelsGained) {
        level += levelsGained;
        if (level >= 70) {
            canBreatheFire = true;
        }
        System.out.println(name + " gained " + levelsGained + " levels and is now on level " + level);
    }

    // Functional Methods
    public void attack() {
        System.out.println("Attack!");
        String symbol = canBreatheFire ? ">" : "~";
        
        for (int i = 1; i <= level; i++) {
            System.out.print(symbol);
            // Print a newline every 10 characters
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        // Final newline if the level wasn't a multiple of 10
        if (level % 10 != 0) {
            System.out.println();
        }
    }

    public int getDefenseRating() {
        int rating = level * 3;
        if (canBreatheFire) {
            rating += 30;
        }
        return rating;
    }
}