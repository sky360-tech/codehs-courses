public class PlaylistRunner
{
    public static void main(String[] args)
    {
        String[] mySongs = {"Song A", "Song B", "Song C", "Song D", "Song E"};
        
        Playlist playlist = new Playlist(mySongs);

        System.out.println("Original Playlist:");
        System.out.print(playlist);

        playlist.reverse();

        System.out.println("\nReversed Playlist:");
        System.out.print(playlist);
    }
}