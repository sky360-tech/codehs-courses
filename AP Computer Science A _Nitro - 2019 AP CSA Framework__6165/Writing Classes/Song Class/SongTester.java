public class SongTester
{
    public static void main(String[] args)
    {
        // Start here!
        Song s = new Song("C416", "Sweden", 3, 32);

        System.out.println(s.toString());

        s.setSeconds(35);

        System.out.println(s.toString());

        s.setArtist("C418");

        System.out.println(s.toString());
    }
}// reviewed: 2026-08-15
