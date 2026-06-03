public class SkateboardShopRunner {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory(50);
        Shop myShop = new Shop("Sk8t 4 Life");

        System.out.println("-- Initial State --");
        System.out.println(myInventory);
        System.out.println(myShop);

        System.out.println("\n-- Sells 30 decks --");
        myShop.sellDecks(myInventory, 30);
        System.out.println(myInventory);
        System.out.println(myShop);

        System.out.println("\n-- Attempt to sell 50 decks --");
        myShop.sellDecks(myInventory, 50);
        System.out.println(myInventory);
        System.out.println(myShop);

        System.out.println("\n-- Restock 100 decks --");
        myShop.restockInventory(myInventory, 100);
        System.out.println(myInventory);
        System.out.println(myShop);
    }
}// reviewed: 2026-06-03
