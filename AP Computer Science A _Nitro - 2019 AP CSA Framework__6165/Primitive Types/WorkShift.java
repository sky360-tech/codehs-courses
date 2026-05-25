public class WorkShift

{

    public static void main(String[] args)

    {

        int workHoursPreLunch = 10;

        int workHoursPostLunch = 10;

        workHoursPostLunch += workHoursPreLunch;

        int fullHourMinute = 60;

        int minutes = 42;

        int seconds = 16;

        workHoursPostLunch *= fullHourMinute;

        workHoursPostLunch *= fullHourMinute;

        seconds += workHoursPostLunch;

        minutes *= fullHourMinute;

        seconds += minutes;

        int secondsTotal = seconds;

        System.out.print ("The doctor worked " + secondsTotal + " seconds");

    }

}