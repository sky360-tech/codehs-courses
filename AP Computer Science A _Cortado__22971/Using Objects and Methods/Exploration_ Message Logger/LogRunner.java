public class LogRunner
{
    public static void main(String[] args)
    {
        // Initiate log for computer system
        String log = "Computer System R48 Log:\n";

        // Add messages to log
        log = Logger.logInfo(log, "Application started successfully.");
        log = Logger.logWarning(log, "Low memory detected.");
        log = Logger.logWarning(log, "An unexpected error occurred.");

        // Print out log
        System.out.println(log);

        // Use helper method to reset log to system R52, then print
        log = resetLog("R52");
        System.out.println();
        System.out.println(log);
    }

    public static String resetLog(String systemNum)
    {
        return "Computer System " + systemNum + " Log:\n";
    }
}// reviewed: 2026-06-30
