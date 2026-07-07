import java.util.Scanner;
public class GraduationCalculator  

{
    public static void main(String[] args) 
    {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for their name
		//Use nextLine to get the String input and store in a String variable
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		//Prompt the user for their grade
		//Use nextInt to get the int input and store in an int variable
		System.out.println("What grade are you in?");
		int grade = input.nextInt();
		
		//Calculate and print the number of years to graduate
		int yearsToGraduate = 12 - grade;
		System.out.print("Years to graduate: ");
		System.out.println(yearsToGraduate);
   	}
}
// reviewed: 2026-07-07
