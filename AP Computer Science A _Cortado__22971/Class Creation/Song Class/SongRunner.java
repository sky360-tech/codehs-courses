public class SongRunner
{
    public static void main(String[] args)
    {
        Song song1 = new Song("The Killers", "Mr. Brightside", 3, 42);
        System.out.println(song1 + "\n");

        Song song2 = new Song("Olivia Rodrigo", "Anti-Hero", 3, 20);
        song2.setArtist("Taylor Swift");
        System.out.println(song2 + "\n");

        Song song3 = new Song("The Weeknd", "Blinding Lights", 3, 20);
        System.out.println(song3 + "\n");
    }
}// reviewed: 2026-06-03
