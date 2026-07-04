public class Painting
{
    private String title;
    private String artist;
    private int year;

    public Painting(String pTitle, String pArtist, int pYear)
    {
        title = pTitle;
        artist = pArtist;
        year = pYear;
    }
    
    public String toString()
    {
        return title + " by " + artist;
    }
}// reviewed: 2026-07-04
