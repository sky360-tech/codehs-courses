import java.util.Scanner;

public class TeenRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Creates a new Teen object and print it out
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend.toString());
        
        // Ask the user to input a text message
        System.out.println("Enter a text: ");
        String message = input.nextLine();
        
        // Call teenTalk method using our myFriend object
        String modifiedText = myFriend.teenTalk(message);
        
        System.out.println("The modified text would be:");
        System.out.println(modifiedText);
    }
}// reviewed: 2026-06-25
