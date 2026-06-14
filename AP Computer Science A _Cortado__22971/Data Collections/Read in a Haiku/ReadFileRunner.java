import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFileRunner
{
   public static void main(String[] args) throws IOException
   {
        File file = new File("haiku.txt");
        Scanner input = new Scanner(file);
        
        // Note: you may also use input.hasNextLine(), which is
        // aligned with using input.nextLine() within the loop
        while (input.hasNext())
        {
            String line = input.nextLine();
            System.out.println(line);
        }
  
        input.close();
   }
}// reviewed: 2026-06-14
