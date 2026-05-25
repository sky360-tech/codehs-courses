public class PersonRunner
{
    public static void main(String[] args)
    {
        // Create a Person object
        Person person1 = new Person("Alice", 15, 54);
        System.out.println("== Initial person info ==\n" + person1);

        // Change the state of the Person object by updating its attributes
        person1.setName("Alice Smith");
        person1.setAge(20);   // Updates status from "child" to "adult" as well
        person1.setHeight(56);

        System.out.println("\n== Updated person info ==\n" + person1);
    }
}