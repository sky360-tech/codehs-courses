public class ClassListRunner
{
    public static void main(String[] args)
    {
        // Create an instance of the Roster class
        Roster myRoster = new Roster();

        // Use the instance methods to add students
        myRoster.addStudent("Alan", 11);
        myRoster.addStudent("Alex", 10);
        myRoster.addStudent("Anita", 12);

        // Print the list of student names using an instance method
        System.out.println(myRoster.getClassList());
    }
}