public class StudentRunner
{
    public static void main(String[] args)
    {
        // Create new student and set gpa
        Student alan = new Student("Alan", "Turing", 11);
        alan.setGPA(3.5);
        
        // Print out information
        System.out.println("Alan first name: " + alan.getFirstName());
        System.out.println("Alan GPA: " + alan.getGPA());
        System.out.println("Alan honor roll? " + alan.isHonorRoll());
        
        // Change first name and print result
        alan.setFirstName("Al");
        System.out.println("Alan first name: " + alan.getFirstName());
        
        // Change grade level and print result
        alan.moveUpGrade();
        System.out.println("Alan grade level: " + alan.getGradeLevel());
    }
}// reviewed: 2026-05-28
