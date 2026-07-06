public class Student
{
    // Instance Variables (Attributes)
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    /**
    * Constructor -- Even though Strings are objects, 
    * they are still passed by value. The values of fName,
    * lName, and grade will be copied to firstName, lastName,
    * and gradeLevel.
    */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    /**
     * This method defines what is printed when the
     * object variable is printed. It is automatically 
     * called when the object variable is printed in 
     * System.out.println().
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
// reviewed: 2026-07-06
