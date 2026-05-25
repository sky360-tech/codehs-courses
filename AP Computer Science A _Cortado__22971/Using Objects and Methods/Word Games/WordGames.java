public class WordGames
{
    public static String scramble(String word)
    {
        // Find the middle of the word
        int mid = word.length() / 2;
        
        // Get the first half (index 0 to mid)
        String firstHalf = word.substring(0, mid);
        
        // Get the second half (index mid to the end)
        String secondHalf = word.substring(mid);
        
        // Return them swapped
        return secondHalf + firstHalf;
    }
    
    public static String bananaSplit(String word, int insertIdx, String insertText)
    {
        // Get the part of the word before the insertion index
        String before = word.substring(0, insertIdx);
        
        // Get the part of the word from the index to the end
        String after = word.substring(insertIdx);
        
        // Concatenate the pieces with the insertText in the middle
        return before + insertText + after;
    }
    
    public static String bananaSplit(String word, String insertChar, String insertText)
    {
        // Find the index of the first occurrence of the character
        int idx = word.indexOf(insertChar);
        
        // Use the previous bananaSplit method logic to insert the text
        // or manually split it here:
        String before = word.substring(0, idx);
        String after = word.substring(idx);
        
        return before + insertText + after;
    }
}