import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SleepDataAnalysis
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("ParticipantASleep.txt");
            Scanner s = new Scanner(f);

            while (s.hasNext())
            {
                String date = s.next();
                double minAsleep = s.nextDouble();
                s.nextDouble(); // read past "minutes in bed" since we don't need it

                System.out.println(date + ": slept " + (minAsleep / 60.0) + " hours");
            }

            s.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}