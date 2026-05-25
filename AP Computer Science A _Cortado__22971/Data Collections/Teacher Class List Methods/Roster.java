import java.util.ArrayList;

public class Roster 
{
    // Declare Student ArrayList variable
    private ArrayList<Student> classList;
    
    public Roster()
    {
        // Initialize ArrayList variable
        classList = new ArrayList<Student>();
    }
    
    // Original addStudent method (adds to the end)
    public void addStudent(String name, int grade)
    {
        classList.add(new Student(name, grade));
    }

    // Overloaded addStudent method (adds at a specific index)
    public void addStudent(int index, String name, int grade)
    {
        // Check if the index is within valid range for adding (0 to size)
        if (index >= 0 && index <= classList.size()) {
            classList.add(index, new Student(name, grade));
        } else {
            System.out.println("Invalid index");
        }
    }

    // Returns the size of the classList
    public int getClassSize()
    {
        return classList.size();
    }

    // Returns the name of a student at a specific index
    public String getStudentName(int index)
    {
        // Check if index is within valid range for accessing (0 to size - 1)
        if (index >= 0 && index < classList.size()) {
            return classList.get(index).getName();
        } else {
            return "Invalid index";
        }
    }

    // Returns the name of the last student in the list
    public String getLastStudentName()
    {
        if (classList.size() > 0) {
            // The last index is always size - 1
            return classList.get(classList.size() - 1).getName();
        } else {
            return "No students in roster";
        }
    }
    
    /**
     * Don't change the code in this method!
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