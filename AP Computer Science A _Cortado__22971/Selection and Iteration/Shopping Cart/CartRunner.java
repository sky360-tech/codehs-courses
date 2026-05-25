import java.util.Scanner;

public class CartRunner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many items are you purchasing? ");
        int numToBuy = input.nextInt();
        
        ShoppingCart myCart = new ShoppingCart();
        
        for (int i = 1; i <= numToBuy; i++) 
        {
            System.out.print("Price of item " + i + "? ");
            double price = input.nextDouble();
            
            myCart.addItem(price);
        }
        

        System.out.println(myCart);
        
        input.close();

    }
}