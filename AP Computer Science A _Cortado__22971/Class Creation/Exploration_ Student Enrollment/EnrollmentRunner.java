public class EnrollmentRunner
{
    public static void main(String[] args)
    {
        EnrollmentSystem karelHigh = new EnrollmentSystem();

        Student student1 = new Student("Alice");
        Student student2 = new Student("Karl");

        student1.enroll(karelHigh);
        student2.enroll(karelHigh);

        System.out.println("\n" + karelHigh);

        student1.printThis();
    }
}