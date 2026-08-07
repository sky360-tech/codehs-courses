import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String givenWord = input.nextLine();
        WordGames wordGame = new WordGames(givenWord);
        
        // Scramble it
        String scrambled = wordGame.scramble();
        System.out.println("Scrambled word: " + scrambled);
        
        // Ask for an index
        System.out.println("Enter an index to insert text: ");
        int idx = input.nextInt();
        input.nextLine(); // Consume the newline
        
        // Ask for text to insert
        System.out.println("Enter text to insert at index " + idx + ": ");
        String insertTextAtIndex = input.nextLine();
        
        // Perform the bananaSplit at the specified index and print the result
        String resultAtIndex = wordGame.bananaSplit(idx, insertTextAtIndex);
        System.out.println("After insertion at index: " + resultAtIndex);
        
        // Ask for a character to insert text at its position
        System.out.println("Enter a character to insert text at its first occurrence: ");
        String insertChar = input.nextLine();
        
        // Ask for text to insert at the character
        System.out.println("Enter text to insert at character '" + insertChar + "': ");
        String insertTextAtChar = input.nextLine();
        
        // Perform the bananaSplit using the character and print the result
        String resultAtChar = wordGame.bananaSplit(insertChar, insertTextAtChar);
        System.out.println("After insertion at character: " + resultAtChar);
        
        // Print the final word representation
        System.out.println("Final word representation: " + wordGame.toString());
        
        input.close(); // Close the scanner to avoid resource leaks
    }
}// reviewed: 2026-08-07
