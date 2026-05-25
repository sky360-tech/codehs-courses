public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
        int cooked = (int)(Math.random() * 240 + 90);
        
        System.out.println("Microwaving for " + cooked + " seconds");
        
        if(cooked <= 94){
            System.out.println("Rolls will be the right temperature!");
        }
        
        if(cooked > 94){
            System.out.println("Rolls will be boiling hot!");
        }
        
        
       // Print the number of seconds
       
       // Use two if statements to print the temperature
    }
}