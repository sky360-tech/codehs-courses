public class TraverseString
{
    public static void main(String[] args)
    {
        traverse("recursion", 0);
    }

    public static void traverse(String string, int index)
    {
        // Base case: stop when index reaches end of string
        if (index == string.length())
        {
            return;
        }

        // Print the character at the current index
        System.out.println(string.charAt(index));

        // Recursive call with next index
        traverse(string, index + 1);
    }
}// reviewed: 2026-06-17
