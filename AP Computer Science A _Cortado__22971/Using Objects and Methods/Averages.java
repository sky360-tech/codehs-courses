public class Averages
{
    public static void main(String[] args)
    {
       // Test your methods here:
       // We wrap the method calls in System.out.println because the methods 
       // return a value rather than printing it themselves.
       
       double avg2 = calculateAverage(10.5, 20.5);
       System.out.println("The average of 2 numbers is: " + avg2);
       
       double avg3 = calculateAverage(10.0, 20.0, 30.0);
       System.out.println("The average of 3 numbers is: " + avg3);
       
       double avg4 = calculateAverage(5, 10, 15, 20);
       System.out.println("The average of 4 numbers is: " + avg4);
    }

    // Calculates the average with two input doubles
    public static double calculateAverage(double a, double b) {
        double sum = a + b;
        return sum / 2.0;
    }

    // Calculates the average with three input doubles
    public static double calculateAverage(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3.0;
    }

    // Calculates the average with four input doubles
    public static double calculateAverage(double a, double b, double c, double d) {
        double sum = a + b + c + d;
        return sum / 4.0;
    }
}// reviewed: 2026-06-26
