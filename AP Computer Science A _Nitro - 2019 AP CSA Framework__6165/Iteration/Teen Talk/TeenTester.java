import java.util.Scanner;

public class TeenTester {
    public static void main(String[] args) {
        // Create a new Teen object
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend.toString());
        
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        
        // Get the text message from the user
        String userInput = scanner.nextLine();
        
        // Call the teenTalk method to translate the message to teen talk
        String teenMessage = myFriend.teenTalk(userInput);
        
        // Print the modified text
        System.out.println("The modified text would be:");
        System.out.println(teenMessage);
        
        // Close the scanner
        scanner.close();
    }
}// reviewed: 2026-07-20
