public class BinaryLinear
{
    public static void main(String[] args) 
    {
        // Try changing the size and the target numbers to see the impact.
        int ARRAY_SIZE = 20000;
        int TARGET = 38244;

        // Generate a sorted array
        int[] numbers = new int[ARRAY_SIZE];
        for (int i = 0; i < numbers.length; i++) 
        {
            // This creates a sorted array where each element is twice its index
            numbers[i] = i * 2;
        }

        // Perform linear search
        System.out.println("Linear search for " + TARGET + ": ");
        System.out.println("Found at: " + linearSearch(numbers,TARGET));

        // Perform binary search
        System.out.println();
        System.out.println("Binary search for " + TARGET + ": ");
        System.out.println("Found at: " + binarySearch(numbers,TARGET));
    }


    /**
     * @param target Value to search for
     * @param numbers array of numbers to search through
     * @return index position for target
     */
    private static int binarySearch(int[] numbers, int target) 
    {
        int begin = 0;
        int end = numbers.length - 1;
        int counter = 0;

        while (begin <= end) 
        {
            counter++;
            // Find mid-point
            int mid = (begin + end) / 2;
            int current = numbers[mid];

            // Test mid-point
            if (target == current) 
            {
                System.out.println("Binary Search Steps: " + counter);
                return mid;
            }
            // Too high
            else if (target < current) 
            {
                end = mid - 1;
            }
            // Too low
            else 
            {
                begin = mid + 1;
            }
        }
        return -1; // Not found
    }

    /**
     * @param target Value to search for
     * @param numbers array of numbers to search through
     * @return index position for target
     */
    private static int linearSearch(int[] numbers, int target) 
    {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            counter ++;
            if (target == numbers[i])
            {
                System.out.println("Linear Search Steps: " + counter);
                return i;
            }
        }
        return -1;
    }
}