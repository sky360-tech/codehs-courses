public class Inventory {
    private int numberOfDecks;

    public Inventory(int initialNumber) {
        numberOfDecks = initialNumber;
    }

    public int getNumberOfDecks() {
        return numberOfDecks;
    }

    public void addDecks(int amount) {
        if (amount > 0) {
            numberOfDecks += amount;
        }
    }

    public void removeDecks(int amount) {
        if (amount > 0 && numberOfDecks >= amount) {
            numberOfDecks -= amount;
        }
    }

    public String toString() {
        return "Number of decks: " + numberOfDecks;
    }
}// reviewed: 2026-06-02
