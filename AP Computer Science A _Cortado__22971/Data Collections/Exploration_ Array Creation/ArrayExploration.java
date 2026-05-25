public class ArrayExploration
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30};
        numbers[1] = 99;

        // Modify Task 1: set last element to 999 using hardcoded index
        numbers[2] = 999;

        System.out.println("Integer Array (length of " + numbers.length + "):");
        System.out.println("Index 0: " + numbers[0]);
        System.out.println("Index 1: " + numbers[1]);
        System.out.println("Index 2: " + numbers[2]);

        String[] words = new String[2];
        words[0] = "Hello";
        words[1] = "World";

        System.out.println("\nString Array (length of " + words.length + "):");
        System.out.println("Index 0: " + words[0]);
        System.out.println("Index 1: " + words[1]);

        // Modify Task 2: double array with explicit values
        double[] scores = {3.4, 9.1, 3.3, 4.2};
        System.out.println("\nScores Array:");
        System.out.println("Index 0: " + scores[0]);
        System.out.println("Index 1: " + scores[1]);
        System.out.println("Index 2: " + scores[2]);
        System.out.println("Index 3: " + scores[3]);

        // Modify Task 3: default boolean array, set second to true
        boolean[] statuses = new boolean[3];
        statuses[1] = true;
        System.out.println("\nStatuses Array:");
        System.out.println("Index 0: " + statuses[0]);
        System.out.println("Index 1: " + statuses[1]);
    }
}