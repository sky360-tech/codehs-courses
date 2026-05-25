public class HomeworkTime
{
    public static void main(String[] args)
    {
        int hours = 2;
        int minutes = 30;
        int seconds = 45;
        
        // Add your code here
        int totalSeconds = hours * 3600;
        totalSeconds += (minutes * 60);
        totalSeconds += seconds;
        System.out.print("Total seconds spent on homework: ");
        System.out.println(totalSeconds);
        
        
    }
}