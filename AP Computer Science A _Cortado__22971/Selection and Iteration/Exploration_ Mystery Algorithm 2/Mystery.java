import java.util.Scanner;

public class Mystery
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String alg2 = algorithm2(str, "*");
        System.out.println(alg2);
    }
    
    public static String algorithm2(String string, String replace)
    {
        String newString = "";
        
        for (int i = 0; i < string.length(); i++) 
        {
            String letter = string.substring(i, i + 1);
            if (letter.equals("A") || letter.equals("a") || letter.equals("E") || letter.equals("e") || letter.equals("I") || letter.equals("i")  || letter.equals("O") || letter.equals("o") || letter.equals("U") || letter.equals("u")) 
            {
                newString += replace;
            } 
            else 
            {
                newString += letter;
            }
        }
        return newString;
    }
}
