public class SimpleGreeter 
{
    public static void main(String[] args) 
    {
        // Create people
        String person1 = "Maria";
        String person2 = "Julian";

        // Greet first person
        greetEnglish(person1);

        // Introduce two people
        introduce(person1, person2);
    }

    /**
     * Prints a greeting in English to a specific person.
     * Precondition: name is a non-null String.
     * Postcondition: "Hello " followed by the name is printed to the console.
     * @param name The name of the person to be greeted.
     */
    public static void greetEnglish(String name) 
    {
        System.out.print("Hello ");
        System.out.println(name);
    }

    /**
     * Introduces one person to another person.
     * Precondition: name1 and name2 are non-null Strings.
     * Postcondition: Prints a message introducing name1 to name2.
     * @param name1 The name of the first person.
     * @param name2 The name of the second person being introduced.
     */
    public static void introduce(String name1, String name2) 
    {
        System.out.print(name1);
        System.out.print(", meet ");
        System.out.println(name2);
    }
}