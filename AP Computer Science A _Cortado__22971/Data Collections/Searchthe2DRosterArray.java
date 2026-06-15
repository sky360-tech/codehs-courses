import java.util.Scanner;

public class FindStudent
{
    public static void main(String[] args)
    {
        String[][] roster = {{"Julio", "Lauren", "James"},
							{"LaKesha", "Rachel", "Alex"},
                            {"Adam", "Paulina", "Reba"}, 
                            {"Shawn", "Kendrick", "Anna"}};	
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a student
        System.out.print("Enter a student's name: ");
        String studentName = input.nextLine();
        
        // Call the findStudent method
        int clubIndex = findStudent(roster, studentName);
        
        // Check if student was found and print result
        if (clubIndex != -1) {
            System.out.println(studentName + " is in club index: " + clubIndex);
        } else {
            System.out.println("The student is not enrolled.");
        }
    }
    
    public static int findStudent(String[][] roster, String targetStudent)
    {
        // Iterate through each club (row)
        for (int row = 0; row < roster.length; row++) {
            // Iterate through each student in that club (column)
            for (int col = 0; col < roster[row].length; col++) {
                
                // Extension: Use equalsIgnoreCase to handle capitalization differences
                if (roster[row][col].equalsIgnoreCase(targetStudent)) {
                    return row; // Found the student, return the club index
                }
            }
        }
        
        return -1; // Student not found in any club
    }
}// reviewed: 2026-06-15
