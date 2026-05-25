import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
       Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");

        // Loop until the correct height is guessed
        while (guess != everestHeight) {
            System.out.print("Guess the height: ");
            guess = scanner.nextInt();  // Read user's guess

            if (guess == everestHeight) {
                System.out.println("Right! Mt. Everest is " + everestHeight + " meters tall!");
            } else {
                System.out.println("That's not it!");
            }
        }
 // Your code goes her
          
    }
}