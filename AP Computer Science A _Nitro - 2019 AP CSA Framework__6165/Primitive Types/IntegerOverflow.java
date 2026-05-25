public class IntegerOverflow
{
    public static void main(String[] args)
    {
        // Minimum and maximum values for an int
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        // Display the minimum and maximum values
        System.out.println("Minimum value for an integer: " + minValue);
        System.out.println("Maximum value for an integer: " + maxValue);

        // Test underflow by subtracting 1 from the minimum value
        int underflowTest = minValue - 1;

        // Test overflow by adding 1 to the maximum value
        int overflowTest = maxValue + 1;

        // Display the results of underflow and overflow
        System.out.println("Minimum value subtracted by 1: " + underflowTest);
        System.out.println("Maximum value with 1 added: " + overflowTest);
    }
}