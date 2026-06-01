public class EnrollmentSystem
{
    String enrolledStudents;
    int studentCount;

    public EnrollmentSystem()
    {
        enrolledStudents = "";
        studentCount = 0;
    }

    public void processEnrollment(Student s)
    {
        System.out.println("Processing enrollment for: " + s.getName());
        if (enrolledStudents.indexOf(s.getName()) != -1)
        {
            System.out.println("That student has already enrolled.");
        }
        else
        {
            enroll(s);
        }
    }

    private void enroll(Student s)
    {
        enrolledStudents += s.getName() + "\n";
        studentCount++;
    }

    public String toString()
    {
        return "There are " + studentCount + " students enrolled:\n"
                + enrolledStudents;
    }
}// reviewed: 2026-06-01
