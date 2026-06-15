public class Playlist 
{
    private String[] songs;

    public Playlist(String[] songList) 
    {
        songs = new String[songList.length];
        for (int i = 0; i < songList.length; i++)
        {
            songs[i] = songList[i];
        }
    }
    
    public void reverse() 
    {
        int left = 0;
        int right = songs.length - 1;

        while (left < right)
        {
            String temp = songs[left];
            songs[left] = songs[right];
            songs[right] = temp;
            left++;
            right--;
        }
    }

    public String toString() 
    {
        String printedSongs = "";
        for (String song : songs)
        {
            printedSongs += song + "\n";
        }
        return printedSongs;
    }
}// reviewed: 2026-06-15
