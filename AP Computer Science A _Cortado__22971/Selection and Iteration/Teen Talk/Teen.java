public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;

    // Constructor
    public Teen(String theFirstName, String theLastName, int theGrade)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
    }
    
    // Replaces all '.' and '!' with '!!'
    public String teenTalk(String text)
    {
        String result = "";
        
        for (int i = 0; i < text.length(); i++)
        {
            String letter = text.substring(i, i + 1);
            
            // Check if the current character is a period or an exclamation mark
            if (letter.equals(".") || letter.equals("!"))
            {
                result += "!!";
            }
            else
            {
                result += letter;
            }
        }
        
        return result;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + ", grade " + grade + ", is texting...\n";
    }
}// reviewed: 2026-06-25
