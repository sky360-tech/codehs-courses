public class OrderRunner
{
    public static void main(String[] args)
    {
        Order order1 = new Order(101, "Charlotte", 2); 
        order1.printOrderDetails();
        
        System.out.println();

        Order order2 = new Order(102, "Alejandro", 4); 
        order2.printOrderDetails();
    }
}