public class Order
{
    private int orderNumber;
    private String customerName;
    private int quantity; 

    public Order(int number, String name, int orderQuantity)
    {
        orderNumber = number;
        customerName = name;
        quantity = orderQuantity;
    }

    /**
     * Prints a summary of the order details using the following variables:
     *      -orderNumber
     *      -customerName
     *      -quantity
     *      -totalCost (before tax)
     *      -taxAmount
     *      -finalAmount
     */
    public void printOrderDetails() {
    // 1. Access instance variables directly
    System.out.println("Order Number: " + orderNumber);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Quantity Ordered: " + quantity);

    // 2. Call methods to retrieve calculated data
    double totalCost = calculateTotalCost();
    double taxAmount = calculateTax(totalCost);
    double finalAmount = calculateFinalAmount(totalCost, taxAmount);

    // 3. Print the calculated values
    System.out.println("Total Cost: $" + totalCost);
    System.out.println("Tax: $" + taxAmount);
    System.out.println("Final Amount: $" + finalAmount);
}


    
    private double calculateTotalCost()
    {
        double sandwichPrice = 5.99;
        double sidePrice = 2.99;
        double drinkPrice = 1.99;
        
        double totalCost = (sandwichPrice + sidePrice + drinkPrice) * quantity; 
        return totalCost; 
    }

    private double calculateTax(double total)
    {
        double taxRate = 0.08; // 8% tax
        double taxAmount = total * taxRate; 
        return taxAmount; 
    }

    private double calculateFinalAmount(double total, double tax)
    {
        double finalAmount = total + tax; 
        return finalAmount; 
    }
}