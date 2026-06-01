public class ExamRunner
{
    public static void main(String[] args)
    {
        // Create an Exam object with an initial score.
        Exam exam = new Exam(75);
        System.out.println("Initial exam:\n" + exam);
        
        // Retake the exam with a new score.
        exam.retakeExam(85);
        System.out.println("\nAfter retake:\n" + exam);
    }
}// reviewed: 2026-06-01
