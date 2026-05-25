public class StringObjects
{
    public static void main(String[] args)
    {
        // Part 1: Create two string variables and a third that
        // references the first:
        String stringOne = "Hello";
        String stringTwo = "World";
        String stringThree = stringOne;



        // Part 2: Assign a new value to stringOne variable:

        stringOne = "Goodbye";

        // Part 3: Print out the values of all three string variables:
        System.out.println("stringOne: " + stringOne);
        System.out.println("stringTwo: " + stringTwo);
        System.out.println("stringThree: " + stringThree);




    }
}