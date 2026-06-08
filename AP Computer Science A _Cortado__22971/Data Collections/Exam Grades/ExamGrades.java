public class ExamGrades 
{
    private int[] grades;
    private int passing;

    public ExamGrades(int[] studentGrades, int passingPercent) 
    {
        grades = new int[studentGrades.length];
        for (int i = 0; i < studentGrades.length; i++)
        {
            grades[i] = studentGrades[i];
        }
        passing = passingPercent;
    }

    public boolean hasAtLeastOnePass() 
    {
        for (int grade : grades)
        {
            if (grade >= passing)
                return true;
        }
        return false;
    }

    public boolean areAllPassing() 
    {
        for (int grade : grades)
        {
            if (grade < passing)
                return false;
        }
        return true;
    }
}// reviewed: 2026-06-08
