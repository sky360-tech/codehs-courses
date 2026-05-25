public class Logger 
{
    // Adds an info message to the input log and returns it
    public static String logInfo(String log, String message) 
    {
        String addInfo = log + "\n[INFO]: " + message;
        return addInfo;
    }

    // Adds a warning message to the input log and returns it
    public static String logWarning(String log, String message) 
    {
        String addWarning = log + "\n[WARNING]: " + message;
        return addWarning;
    }

    // Adds an error message to the input log and returns it
    public static String logError(String log, String message) 
    {
        String addError = log + "\n[ERROR]: " + message;
        return addError;
    }
}