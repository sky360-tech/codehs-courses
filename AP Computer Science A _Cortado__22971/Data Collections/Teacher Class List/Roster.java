import java.util.ArrayList;

public class Roster 
{
    // Declare Student ArrayList variable
    private ArrayList<Student> classList;
    
    public Roster()
    {
        // Initialize ArrayList variable (and allocate memory)
        // with a new student arraylist
        classList = new ArrayList<Student>();
    }
    
    // Creates new student object and adds to class list
    public void addStudent(String name, int grade)
    {
        // Create the new Student object
        Student newStudent = new Student(name, grade);
        
        // Add the new object to the classList
        classList.add(newStudent);
    }
    
    /**
     * Don't change the code in this method!
     * This method will print out all the Student names
     * in the classList Array.
     */
    public String getClassList()
    {
        String names = "";
        for (Student name: classList)
        {
            names += name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}