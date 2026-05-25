import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence that uses the word 2 instead of to:");
        String user = input.nextLine();
        
        System.out.println(useProperGrammar(user));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String newString = "";
        int counter = 0;
        for(int i = 0; i < theText.length(); i++){
            if(theText.substring(i, i+1).equals("2")){

                newString += "to";
                counter++;
            }else{
                newString += theText.substring(i,i+1);
            }
        }
         String counter1 = "Fixed " + counter + " grammatical errors: "; 
        return newString+ "/n" + counter1;
    }
}