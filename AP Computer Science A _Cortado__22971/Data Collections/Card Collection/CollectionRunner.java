public class CollectionRunner
{
    public static void main(String[] args)
    {
        CardCollection myCollection = new CardCollection();

        myCollection.loadCardsFromFile("cards_collected.txt");

        myCollection.displayCollection();

        myCollection.printPerfect();

        System.out.println("Total Value: $" + myCollection.getTotalValue());
    }
}