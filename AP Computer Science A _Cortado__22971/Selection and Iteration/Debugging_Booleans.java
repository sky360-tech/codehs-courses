public class BooleanDebug 
{
    public static void main(String[] args) 
    {
        // Change these values to test different situations!
        boolean isComplete = true;
        boolean hasFeedback = false;

        // This should print: 
        // "You're done! Now go get some feedback." 
        // when work is complete but does not have feedback
        if (isComplete && hasFeedback)  
        {
            System.out.println("You're done! Now go get some feedback.");
        } 
        else 
        {
            System.out.println("You're either not done yet or already got feedback. Keep going!");
        }

        // This should print:
        // "Nice! You're making progress."
        // when work is complete OR has feedback
        if (!(isComplete || hasFeedback)) 
        {
            System.out.println("Nice! You're making progress.");
        } 
        else 
        {
            System.out.println("Let's get this rolling — nothing's done yet!");
        }

        // This should print:
        // "Nothing here yet — time to get moving!"
        // when work is NOT complete and does NOT have feedback
        if (isComplete && !hasFeedback)  
        {
            System.out.println("Nothing here yet — time to get moving!");
        } 
        else 
        {
            System.out.println("You're on your way — keep it up!");
        }
    }
}
// reviewed: 2026-06-19
