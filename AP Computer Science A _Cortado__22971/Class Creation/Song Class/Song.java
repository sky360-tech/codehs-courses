public class Song
{
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

    public Song(String artist, String title, int minutes, int seconds)
    {
        this.artist = artist;
        this.title = title;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getMinutes()
    {
        return this.minutes;
    }

    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }

    public int getSeconds()
    {
        return this.seconds;
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public String toString()
    {
        return "artist= " + artist + "\ntitle= " + title + "\nTime= " + minutes + ":" + seconds;
    }
}