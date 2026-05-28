public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }

    public String moveUpGrade()
    {
        if (gradeLevel < 12)
        {
            gradeLevel++;
            return "You are now in grade " + gradeLevel + "!";
        }
        else
        {
            gradeLevel = 13;
            return "You graduated, congratulations!";
        }
    }

    public String getSchoolLevel()
    {
        if (gradeLevel < 6)
        {
            return "Elementary School";
        }
        else if (gradeLevel < 9)
        {
            return "Junior High";
        }
        else
        {
            return "High School";
        }
    }

    public boolean isHonorRoll()
    {
        return gpa >= 3.5;
    }

    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public double getGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}// reviewed: 2026-05-28
