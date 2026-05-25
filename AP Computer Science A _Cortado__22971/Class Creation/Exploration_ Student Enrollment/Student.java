public class Student
{
    private String name;
    private boolean enrolled;

    public Student(String name)
    {
        this.name = name;
        this.enrolled = false;
    }

    public void enroll(EnrollmentSystem es)
    {
        this.enrolled = true;
        es.processEnrollment(this);
    }

    public String getName()
    {
        return this.name;
    }

    public void printThis()
    {
        System.out.println(this);
    }

    public String toString()
    {
        return "Student: " + this.name + " | Enrolled: " + this.enrolled;
    }
}