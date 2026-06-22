public class findCharEfficient
{
    public static void main(String[] args)
    {
        // Use this to test your algorithm
        String word = "This is a sentence";
        String key = "a";
        findChar(word, key);
    }
    
    public static void findChar(String str, String key)
    {
        // Check if the string contains the key using the contains method
        if (str.contains(key)) 
        {
            System.out.println("Found!");
        }
    }
}// reviewed: 2026-06-22
