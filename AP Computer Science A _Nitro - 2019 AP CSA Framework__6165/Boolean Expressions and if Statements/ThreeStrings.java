import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        Scanner scanner = new Scanner(System.in);

        String companyCode = "1298";
        

        String userPassword =  scanner.nextLine();
        

        String userSecretCode =  scanner.nextLine(); 
        
        String expectedString = userPassword + companyCode;
        
        String actualString = userPassword + userSecretCode; 
        
        if (expectedString.equals(actualString)) { 
            System.out.println("Access granted"); 
            
        } else {
            System.out.println(userPassword + userSecretCode + " is denied"); 
            
        } scanner.close(); 
        
    } 
    
}// reviewed: 2026-07-17
