public class Art 
{
    private String[][] artArray;

    public Art(String[][] art)
    {
        artArray = new String[art.length][art[0].length];
        for (int row = 0; row < art.length; row++)
        {
            for (int col = 0; col < art[0].length; col++)
            {
                artArray[row][col] = art[row][col];
            }
        }
    }

    // Flips each row horizontally
    public void flipHorizontally()
    {
        int numCols = artArray[0].length;
        for (int row = 0; row < artArray.length; row++)
        {
            // Only loop halfway through the columns to perform swaps
            for (int col = 0; col < numCols / 2; col++)
            {
                // Standard swap logic
                String temp = artArray[row][col];
                artArray[row][col] = artArray[row][numCols - 1 - col];
                artArray[row][numCols - 1 - col] = temp;
            }
        }
    }

    // Optional Extension: Flips the rows vertically
    public void flipVertically()
    {
        int numRows = artArray.length;
        for (int row = 0; row < numRows / 2; row++)
        {
            // Swap the entire row array
            String[] temp = artArray[row];
            artArray[row] = artArray[numRows - 1 - row];
            artArray[numRows - 1 - row] = temp;
        }
    }

    // Optional Extension: Rotate 180 (Flip both ways)
    public void rotate180()
    {
        flipHorizontally();
        flipVertically();
    }

    public String toString()
    {
        String result = "";
        for (String[] row : artArray) 
        {
            for (String symbol : row) 
            {
                result += symbol;
            }
            result += "\n";
        }
        return result;
    }
}