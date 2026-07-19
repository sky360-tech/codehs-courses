import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);


        System.out.println("Enter your word:");

        String userWord = input.nextLine();


        System.out.println("Enter the letter to be replaced:");

        String replLetter = input.nextLine();


        System.out.println("Enter the new letter:");

        String newLetter = input.nextLine();
        
        System.out.println(replaceLetter(userWord, replLetter, newLetter));


        
    }
   
    public static String replaceLetter(String word, String letterToReplace, String replacementLetter)

{

        boolean found = false;


        for (int i = 0; i < word.length(); i++)

        {

        if (word.substring(i, i + 1).equals(letterToReplace) && !found)

        {

            found = true;

        }else if (word.substring(i, i + 1).equals(letterToReplace) && found)
        
        {

        word = word.substring(0, i) + replacementLetter + word.substring(i+1);


        }

    }

        return word;

    }

}// reviewed: 2026-07-19
