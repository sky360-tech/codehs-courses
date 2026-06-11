import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SleepDataAnalysis
{
    public static void main(String[] args)
    {
        double[] amountSleep = new double[25];
        int index = 0;

        try
        {
            File f = new File("ParticipantASleep.txt");
            Scanner s = new Scanner(f);

            while (s.hasNext())
            {
                String date = s.next();
                double minAsleep = s.nextDouble();
                s.nextDouble(); // skip minutes in bed

                double hoursAsleep = minAsleep / 60.0;
                System.out.println(date + ": slept " + hoursAsleep + " hours");

                amountSleep[index] = hoursAsleep;
                index++;
            }

            s.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

        // Print summary
        double avg = findAverageSleep(amountSleep);
        System.out.println("*********************");
        System.out.println("SUMMARY");
        System.out.println("Average sleep: " + avg + " hours");
        System.out.println("Getting recommended sleep: " + isEnoughSleep(avg));
    }

    public static double findAverageSleep(double[] sleep)
    {
        double total = 0;
        for (double hours : sleep)
        {
            total += hours;
        }
        return total / sleep.length;
    }

    public static boolean isEnoughSleep(double avg)
    {
        return avg >= 7.0;
    }
}// reviewed: 2026-06-11
