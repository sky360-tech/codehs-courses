public class WordGames
{
    // Instance variable
    private String word;
    
    // Constructor that takes a word to set the instance variable 'word'
    public WordGames(String text)
    {
        word = text;
    }
    
    // Scrambles the word by switching the first half and the second half
    public String scramble()
    {
        int mid = word.length() / 2;
        // Combine second half and first half of the word
        return word.substring(mid) + word.substring(0, mid);
    }
    
    // Inserts insertText at the specified index insertIdx in the word
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Create new string with insertText inserted at insertIdx
        return word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
    }
    
    // Inserts insertText at the first occurrence of insertChar in the word
    public String bananaSplit(String insertChar, String insertText)
    {
        int charIdx = word.indexOf(insertChar);
        if (charIdx == -1) {
            return word; // If the character is not found, return the word as is
        }
        return word.substring(0, charIdx) + insertText + word.substring(charIdx);
    }
    
    // toString method that returns the word enclosed in square brackets
    public String toString()
    {
        return "[" + word + "]";
    }
}