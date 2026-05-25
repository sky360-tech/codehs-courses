import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlayerRunner
{
    public static void main(String[] args)
    {
        String[] players = new String[30];
        int index = 0;

        try
        {
            File f = new File("Players.txt");
            Scanner input = new Scanner(f);

            while (input.hasNextLine() && index < players.length)
            {
                players[index] = input.nextLine();
                index++;
            }

            input.close();
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("--- Brazil ---");
        int brazilCount = countryNumPlayers(players, "Brazil");
        System.out.println("Total: " + brazilCount);

        System.out.println("\n--- Argentina ---");
        int argentinaCount = countryNumPlayers(players, "Argentina");
        System.out.println("Total: " + argentinaCount);

        System.out.println("\n--- England ---");
        int englandCount = countryNumPlayers(players, "England");
        System.out.println("Total: " + englandCount);
    }

    public static int countryNumPlayers(String[] players, String country)
    {
        int count = 0;

        for (String player : players)
        {
            if (player != null && player.endsWith(country))
            {
                System.out.println(player);
                count++;
            }
        }

        return count;
    }
}