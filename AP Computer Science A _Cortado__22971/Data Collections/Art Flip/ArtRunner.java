public class ArtRunner
{
    public static void main(String[] args)
    {
        String[][] art1 = {
            {" ", "|", " ", "|", "_", "_", "_", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", "@", "|", "_", "_", "_", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "O"},
            {"|", " ", " ", " ", " ", "|", "_", "_", "_", "_", "|", " "},
            {"|", "_", "_", "_", "_", "|", " ", " ", " ", " ", " ", " "}
        };
        
        // Create new Art object and print original art
        Art myArt = new Art(art1);
        System.out.println("Original Art:");
        System.out.println(myArt);

        // Flip Art horizontally and print the results
        System.out.println("Flipped Horizontally:");
        myArt.flipHorizontally();
        System.out.println(myArt);
        
        /* // Optional Tests:
        System.out.println("Flipped Vertically (from current state):");
        myArt.flipVertically();
        System.out.println(myArt);
        */
    }
}// reviewed: 2026-06-05
