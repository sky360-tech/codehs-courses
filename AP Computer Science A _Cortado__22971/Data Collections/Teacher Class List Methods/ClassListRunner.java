public class ClassListRunner
{
    public static void main(String[] args)
    {
        // You don't need to change anything here, but feel free to add more students!
        Roster myRoster = new Roster();

        myRoster.addStudent("Alan", 11);
        myRoster.addStudent("Alex", 10);
        myRoster.addStudent("Anita", 12);

        System.out.println(myRoster.getClassList());

        System.out.println("Last Student: " + myRoster.getLastStudentName());
        System.out.println("First Student: " + myRoster.getStudentName(0));
        System.out.println("Fourth Student: " + myRoster.getStudentName(3));

        System.out.println();

        myRoster.addStudent(2, "Trevor", 12);
        System.out.println(myRoster.getClassList());
        System.out.println("Class Size: " + myRoster.getClassSize());
    }
}