public class ActivityTracker
{
    public static void main(String[] args)
    {
        //creating a log for the user for the amount of time the user ran
        ActivityLog mylog = new ActivityLog();
        
        mylog.addMiles(5);
        mylog.addHours(1);
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        // tracking the hours for the user
        double hoursToday = mylog.getHours();
        
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}// reviewed: 2026-08-10
