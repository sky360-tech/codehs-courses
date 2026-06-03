public class MovieRunner
{
    public static void main(String[] args)
    {
        // Create director object for Nolan
        Director nolan = new Director("Christopher Nolan", 25);
        
        // Create two movie objects
        Movie inception = new Movie("Inception", 2010, nolan);
        Movie matrix = new Movie("The Matrix", 1999, nolan);

        // Change the director info associated with The Matrix
        matrix.setDirectorName("Wachowskis");
        matrix.setDirectorYears(24);

        // Print out director and movie objects
        System.out.println(nolan);
        System.out.println("\n" + inception);
        System.out.println("\n" + matrix);
    }
}// reviewed: 2026-06-03
