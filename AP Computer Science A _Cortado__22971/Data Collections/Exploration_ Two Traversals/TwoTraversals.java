public class TwoTraversals
{
    public static void main(String[] args)
    {
        int[] scores = {80, 92, 91, 68, 88};
        doubleValues(scores);
        System.out.println("Traditional for loop:");
        printTraditional(scores);
        System.out.println("\nEnhanced for loop:");
        printEnhanced(scores);
    }

    public static void printTraditional(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {   
            System.out.println(arr[i]);
        }
    }

    public static void printEnhanced(int[] arr)
    {
        for (int item : arr)
        {
            System.out.println(item);
        }
    }

    // Doubles every value in the array
    public static void doubleValues(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] * 2;
        }
    }
}