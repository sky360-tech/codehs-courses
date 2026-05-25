public class Shop {
    private String name;
    private int totalDecksSold;

    public Shop(String shopName) {
        name = shopName;
        totalDecksSold = 0;
    }

    public void sellDecks(Inventory inventory, int amount) {
        if (amount <= 0) {
            System.out.println("Error: Sale amount must be positive.");
        } else if (inventory.getNumberOfDecks() < amount) {
            System.out.println("There are not enough decks in inventory to sell that amount.");
        } else {
            inventory.removeDecks(amount);
            totalDecksSold += amount;
        }
    }

    public void restockInventory(Inventory inventory, int amount) {
        if (amount > 0) {
            inventory.addDecks(amount);
        }
    }

    public int getTotalDecksSold() {
        return totalDecksSold;
    }

    public String toString() {
        return name + " number of decks sold: " + totalDecksSold;
    }
}