import java.util.Scanner;

public class StringExplorer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your favorite school subject:");
        String subject = input.nextLine();
    
        String subjectLowerCase = subject.toLowerCase();
        System.out.print("Your favorite subject in lower case: ");
        System.out.println(subjectLowerCase);

        boolean contains = subjectLowerCase.contains("computer");
        System.out.print("Subject contains \"computer\": ");
        System.out.println(contains);

        int subjectLength = subject.length();
        System.out.print("The total length of the subject is: ");
        System.out.println(subjectLength);
    }
}// reviewed: 2026-06-29
