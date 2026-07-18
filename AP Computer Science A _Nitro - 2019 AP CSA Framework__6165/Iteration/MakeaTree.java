public class TreeOfStars {
    public static void main(String[] args) {
        makeATree();
    }

    public static void makeATree() {
        int levels = 9;  // Number of levels in the tree

        // Outer loop to handle the rows
        for (int i = 0; i < levels; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars with space between them
            for (int k = 0; k < levels - i; k++) {
                System.out.print("*");
                if (k < levels - i - 1) {
                    System.out.print(" "); // Add space between stars, but not after the last star
                }
            }

            // Add exactly one trailing space after each line
            System.out.print(" "); 
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}// reviewed: 2026-07-18
