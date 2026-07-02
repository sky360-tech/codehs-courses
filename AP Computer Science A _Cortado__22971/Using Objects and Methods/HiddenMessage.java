public class HiddenMessage
{
    public static void main(String[] args)
    {
        String quote1 = "Coding like poetry";
        String quote2 = "should be short";
        String quote3 = "and concise.";
        String author = "Santosh Kalwar";
        
        // Construct "alan turing" using at least 7 substring calls
        String message = quote3.substring(0, 1) +   // 'a' from index 0 of quote3
                         quote1.substring(7, 8) +   // 'l' from index 7 of quote1
                         author.substring(9, 10) +  // 'a' from index 9 of author
                         quote3.substring(1, 2) +   // 'n' from index 1 of quote3
                         quote1.substring(6, 7) +   // ' ' (space) from index 6 of quote1
                         quote1.substring(15, 16) + // 't' from index 15 of quote1
                         quote2.substring(3, 4) +   // 'u' from index 3 of quote2
                         quote1.substring(16, 17) + // 'r' from index 16 of quote1
                         quote1.substring(3, 4) +   // 'i' from index 3 of quote1
                         quote3.substring(6, 7) +   // 'n' from index 6 of quote3
                         quote1.substring(5, 6);    // 'g' from index 5 of quote1
        
        System.out.println(message);
    }
}// reviewed: 2026-07-02
