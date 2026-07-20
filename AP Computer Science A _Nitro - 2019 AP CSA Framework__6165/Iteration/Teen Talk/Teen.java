public class Teen {
    private String firstName;
    private String lastName;
    private int grade;

    // Constructor to make a teen with a first and last name, grade in school
    public Teen(String theFirstName, String theLastName, int theGrade) {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
    }

    // toString method to print out the state of the teen object
    public String toString() {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }

    // Method to change the text message by replacing '.' and '!' with "!!"
    public String teenTalk(String text) {
        // Replace '.' and '!' with '!!'
        return text.replace(".", "!").replace("!", "!!");
    }
}// reviewed: 2026-07-20
