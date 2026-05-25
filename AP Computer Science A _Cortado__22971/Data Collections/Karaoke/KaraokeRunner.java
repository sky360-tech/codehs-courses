import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KaraokeRunner
{
   public static void main(String[] args) throws IOException 
   {
        // Create a File object
        File f = new File("As It Was.txt");
        
        // Create a Scanner object
        Scanner input = new Scanner(f);
        
        // Use a while loop to access and print each line of the song
        while(input.hasNextLine())
        {
            String word = input.nextLine();
            if(word.contains("was"))
            {
                System.out.println(word + " WHAT!");
            }
            else
            {
                System.out.println(word);
            }
        }
        
        // Close the Scanner object
        input.close();
   }
}