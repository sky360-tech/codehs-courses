import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CardCollection
{
    private ArrayList<Card> collection;

    public CardCollection()
    {
        collection = new ArrayList<Card>();
    }

    public double getTotalValue()
    {
        double total = 0;
        for (Card card : collection)
        {
            total += card.getValue();
        }
        return total;
    }

    public void printPerfect()
    {
        System.out.println("Cards in perfect condition:");
        for (Card card : collection)
        {
            if (card.getCondition().equals("Perfect"))
            {
                System.out.println(card.getName());
            }
        }
        System.out.println();
    }

    public void orderNumerically()
    {
        for (int i = 0; i < collection.size() - 1; i++)
        {
            for (int j = 0; j < collection.size() - 1 - i; j++)
            {
                if (collection.get(j).getSetNum() > collection.get(j + 1).getSetNum())
                {
                    Card temp = collection.get(j);
                    collection.set(j, collection.get(j + 1));
                    collection.set(j + 1, temp);
                }
            }
        }
    }

    public void loadCardsFromFile(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNext())
            {
                String line = input.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4)
                {
                    String name = parts[0];
                    String condition = parts[1];
                    double value = Double.parseDouble(parts[2]);
                    int setNum = Integer.parseInt(parts[3]);
                    Card newCard = new Card(name, condition, value, setNum);
                    collection.add(newCard);
                }
            }
            input.close();
            System.out.println("Cards loaded successfully!\n");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void displayCollection()
    {
        System.out.println("=== Card Collection ===");
        for (Card card : collection)
        {
            System.out.println(card);
        }
        System.out.println();
    }
}// reviewed: 2026-06-06
