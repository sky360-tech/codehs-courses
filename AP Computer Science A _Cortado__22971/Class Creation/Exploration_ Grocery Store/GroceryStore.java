public class GroceryStore
{
    private String storeName;
    private int totalCashRegisters;

    public GroceryStore(String name, int registers)
    {
        storeName = name;
        totalCashRegisters = registers;
    }

   public void updateStoreName(String storeName)
   {
    this.storeName = storeName; // 'this' refers to the class level variable
    }


    public void processCustomer(String customerName)
    {
        System.out.println(storeName + " is processing order for: " + customerName);
    }

    public void checkoutLane1()
    {
        String cashRegister = "Checkout Lane 1 is open.";
        System.out.println(cashRegister);
    }

    public void checkoutLane2()
    {
        String cashRegister = "Checkout Lane 2 is open.";
        System.out.println(cashRegister);
    }

    public void displayStockLevels() {
    for (int aisle = 1; aisle <= 3; aisle++) {
        for (int shelf = 1; shelf <= 3; shelf++) {
            System.out.println("Checking stock for aisle " + aisle + ", shelf " + shelf);
        }
    }
    }

    
    public String getStoreName()
    {
        return storeName;
    }
}