public class WithMethods 
{
    public static void main(String[] args) 
    {
        // Reverse three strings
        reverse("Hello");
        reverse("Hi there");
        reverse("Greetings");
    }

    // Method that reverses an input string and prints it out
    public static void reverse(String str)
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}// reviewed: 2026-07-04
