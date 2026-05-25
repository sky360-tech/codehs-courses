import java.util.Scanner;
public class GuessEverestHeight
{ 
    static final int EVEREST_HEIGHT = 8848;
    
    public static void main(String[] args)
    {
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.\n");
        
        // Start the guessing...
        guessTheHeight();
    }
    
    // Allow the user to keep guessing until they guess the correct height
    public static void guessTheHeight() 
    {  
         Scanner input = new Scanner(System.in);
        int guess = 0; // Initialize with a value that is not EVEREST_HEIGHT
    
        // Loop until the correct height is guessed
        while (guess != EVEREST_HEIGHT)
        {
            System.out.println("Guess the height: ");
            guess = input.nextInt();
        
             if (guess != EVEREST_HEIGHT)
            {
                System.out.println("That's not it!\n");
            }
        }
    
        System.out.println("Right! Mt. Everest is 8,848 meters tall!");
        input.close();
        
          
    }
}