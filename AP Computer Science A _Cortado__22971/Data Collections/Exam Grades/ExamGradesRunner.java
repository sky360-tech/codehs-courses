public class ExamGradesRunner
{
    public static void main(String[] args) 
    {
        int[] studentGrades = {55, 70, 85, 90, 45};
        
        ExamGrades exam = new ExamGrades(studentGrades, 60);
        
        System.out.println("At least one student passed: " + exam.hasAtLeastOnePass());
        System.out.println("All students passed: " + exam.areAllPassing());
    }
}