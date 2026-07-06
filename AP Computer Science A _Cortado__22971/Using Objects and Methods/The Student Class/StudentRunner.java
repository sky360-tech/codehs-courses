public class StudentRunner
{
    public static void main(String[] args)
    {
        // Create new Student objects
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        
        // Print out the information in each student object.
        // This automaticallys calls their toString() methods.
        System.out.println(alan);
        System.out.println(ada);
    }
}
// reviewed: 2026-07-06
