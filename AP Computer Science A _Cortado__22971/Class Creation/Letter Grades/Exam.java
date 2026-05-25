public class Exam
{
    // Create instance variables for score and letterGrade:
    private int score;
    private String letterGrade;
    
    // Constructor: Sets the score and updates the letter grade.
    public Exam(int initialScore)
    {
        score = initialScore;
        // Update the letter grade based on the score
        updateLetterGrade();
    }
    
    /* 
    * Private helper method that updates letterGrade
    */
    private void updateLetterGrade()
    {
        if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 70) {
            letterGrade = "C";
        } else if (score >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
    }
    
    // Method that returns score value
    public int getScore()
    {
        return score;
    }
    
    // Method that returns letter grade
    public String getLetterGrade()
    {
        return letterGrade;
    }
    
    // Updates the score and then recalculates the letter grade.
    public void retakeExam(int newScore)
    {
        score = newScore;
        updateLetterGrade();
    }
    
    // Returns a string representation of the exam details.
    public String toString()
    {
        return "Score: " + score + ", Grade: " + letterGrade;
    }
}