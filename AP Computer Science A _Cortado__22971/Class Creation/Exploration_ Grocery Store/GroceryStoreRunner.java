public class GroceryStoreRunner
{
    public static void main(String[] args)
    {
        GroceryStore store = new GroceryStore("FreshMart", 5);
        
        store.processCustomer("Justin Smith");
        System.out.println();
        
        store.checkoutLane1();
        store.checkoutLane2();
        System.out.println();
        
        store.displayStockLevels();
        System.out.println();
        
        store.updateStoreName("SuperMart");
        System.out.println("Store name: " + store.getStoreName());
    }
}// reviewed: 2026-05-31
