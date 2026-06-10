import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {5, 3, 4, 1, 6, 2};
        int[] arr3 = {10, 2, 8, 4, 6}; // Your own array

        System.out.println("--- Sorting arr1 ---");
        selectionSort(arr1);

        System.out.println("\n--- Sorting arr2 ---");
        selectionSort(arr2);

        System.out.println("\n--- Sorting arr3 ---");
        selectionSort(arr3);
    }

    private static void selectionSort(int[] arr) {
        // Print the initial state of the array
        System.out.println("Initial: " + Arrays.toString(arr));

        // 1. Moving the current index: driven by this outer loop
        for (int curIndex = 0; curIndex < arr.length - 1; curIndex++) {
            
            // 2. Finding the minimum: driven by the findMin method call
            int minIndex = findMin(arr, curIndex);

            // 3. Swapping the minimum: driven by the swap method call
            // Only swap if the minimum isn't already at the current index
            if (curIndex != minIndex) {
                swap(arr, curIndex, minIndex);
                System.out.println("Pass " + (curIndex + 1) + ": " + Arrays.toString(arr));
            } else {
                System.out.println("Pass " + (curIndex + 1) + ": (No swap needed)");
            }
        }
    }

    private static int findMin(int[] arr, int startingIndex) {
        int minIndex = startingIndex;
        for (int i = minIndex + 1; i < arr.length; i++) {
            // To reverse sort, change '<' to '>'
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}// reviewed: 2026-06-10
