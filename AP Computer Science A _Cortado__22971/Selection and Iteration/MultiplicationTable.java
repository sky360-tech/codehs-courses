public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        // Call this method with any integer as an argument
         printTable(6);
        
        
    }

    // Prints the multiplication table (1-12) for the specified number
    public static void printTable(int num)
    {
        // Your code goes here!
        for (int i = 1; i <= 12; i++) 
        {
            int result = num * i;
            
            System.out.println(num + " * " + i + " = " + result);
            
        }
        
        
        
    }
}// reviewed: 2026-06-23
