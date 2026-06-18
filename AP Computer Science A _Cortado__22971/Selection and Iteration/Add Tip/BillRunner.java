public class BillRunner 
{
    public static void main(String[] args) 
    {
        // Create Bill objects and test functionality
        Bill bill1 = new Bill(100.00, 10);
        bill1.addTip();
        bill1.displayTotal();

        Bill bill2 = new Bill(100.00, 5);
        bill2.addTip();
        bill2.displayTotal();
    }
}// reviewed: 2026-06-18
