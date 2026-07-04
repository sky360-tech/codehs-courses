public class NoMethods
{
    public static void main(String[] args)
    {
        // Reverse string 1
        String first = "Hello";
        String firstReversed = "";
        for (int i = first.length() - 1; i >= 0; i--) 
        {
            firstReversed += first.charAt(i);
        }
        System.out.println(firstReversed);

        // Reverse string 2
        String second = "Hi there";
        String secondReversed = "";
        for (int i = second.length() - 1; i >= 0; i--) 
        {
            secondReversed += second.charAt(i);
        }
        System.out.println(secondReversed);

        // Reverse string 3
        String third = "Greetings";
        String thirdReversed = "";
        for (int i = third.length() - 1; i >= 0; i--) 
        {
            thirdReversed += third.charAt(i);
        }
        System.out.println(thirdReversed);
    }
}// reviewed: 2026-07-04
