public class StudentRunner 
{
    public static void main(String[] args) 
    {
        // Create a Student object starting in grade 5.
        Student student = new Student(5);
        System.out.println("Before promotion: \n" + student);
        
        // Promote the student from grade 5 to 6.
        student.promote();
        System.out.println("\nAfter promotion to grade 6: \n" + student);
        
        // Promote the student again.
        student.promote();
        System.out.println("\nAfter promotion to grade 7: \n" + student);
    }
}// reviewed: 2026-06-01
