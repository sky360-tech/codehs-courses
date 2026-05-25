public class Student 
{
    // Private instance variables
    private int currentGrade;
    private String school;

    // Constructor initializes the grade and sets the school appropriately.
    public Student(int grade) 
    {
        currentGrade = grade;
        updateSchool();
    }
    
    /* 
    * Private helper method to update the school based on the current grade.
    * For this example:
    *   Grades 1-5 are considered "Elementary School"
    *   Grade 6 and above are considered "Upper School"
    */
    private void updateSchool() 
    {
        if (currentGrade < 6) 
        {
            school = "Elementary School";
        } 
        else 
        {
            school = "Upper School";
        }
    }
    
    // Public method to get the current grade.
    public int getGrade() 
    {
        return currentGrade;
    }
    
    // Public method get the school.
    public String getSchool() 
    {
        return school;
    }
    
    // This method increases the grade and then updates the school if needed.
    public void promote() 
    {
        currentGrade++;
        // If the student is promoted into a new school range 
        // (e.g., from 5 to 6), update the school accordingly.
        if (currentGrade == 6) 
        {
            updateSchool();
        }
    }
    
    public String toString() 
    {
        return "Grade: " + currentGrade + ", School: " + school;
    }
}