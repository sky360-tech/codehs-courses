public class Grid 
{
    private int size;
    
    public Grid(int gridSize)
    {
        size = gridSize;
    }
    
    // Prints a grid of size `size`
   public void printGrid()
    {
    // Outer loop for rows
    for (int row = 0; row < size; row++) 
    {
        // Inner loop for columns
        for (int col = 0; col < size; col++) 
    	{
            // Print the coordinate without a new line
            System.out.print("(" + row + "," + col + ") ");
    	}
        // After each row is finished, move to the next line
        System.out.println();
    }
    }

    
    public String toString()
    {
        return "Grid with a size of " + size;
    }
}