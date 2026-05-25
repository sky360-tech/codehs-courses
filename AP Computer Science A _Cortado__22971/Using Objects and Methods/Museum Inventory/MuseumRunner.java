public class MuseumRunner
{
    public static void main(String[] args)
    {
        int numWorks = 150000;
        String museum = "Museum of Modern Art";
        String city = "New York City";
        
        System.out.println("The " + museum + " museum in " + city + " has " + numWorks + " works of art.");
        
        Painting painting = new Painting("The Starry Night", "Vincent van Gogh", 1889);
        System.out.println("One of the artworks is " + painting);
    }
}