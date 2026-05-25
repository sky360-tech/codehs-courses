public class BinaryRecursion 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {3, 6, 17, 19, 23, 30, 50};
        
        // Testing index1
        System.out.println("--- Searching for 6 ---");
        int index1 = binaryRec(arr1, 6, 0, arr1.length - 1);
        System.out.println("Result for index1: " + index1);

        // Task: Uncomment and explore using index2 and index3
        System.out.println("\n--- Searching for 30 ---");
        int index2 = binaryRec(arr1, 30, 0, arr1.length - 1);
        System.out.println("Result for index2: " + index2);

        System.out.println("\n--- Searching for 40 ---");
        int index3 = binaryRec(arr1, 40, 0, arr1.length - 1);
        System.out.println("Result for index3: " + index3);

        // Task: Define and experiment with an array named arr2
        System.out.println("\n--- Searching in arr2 ---");
        int[] arr2 = {10, 20, 30, 40, 50}; 
        int index4 = binaryRec(arr2, 20, 0, arr2.length - 1);
        System.out.println("Result for arr2 search: " + index4);
    }

    public static int binaryRec(int[] array, int target, int begin, int end) 
    {
        // Base case - Target not found!
        if (begin > end) 
        {
            return -1;
        }
        
        // Calculate the midpoint
        int mid = (begin + end) / 2;
        
        // Print out the search state
        printArray(array, target, begin, mid, end);
            
        // Base Case - Target found!
        if (target == array[mid]) 
        { 
            return mid;  
        }
        // Midpoint value is greater than target, search lower half
        else if (target < array[mid]) 
        { 
            return binaryRec(array, target, begin, mid - 1);
        }
        // Midpoint value is less than target, search upper half
        else 
        {
            return binaryRec(array, target, mid + 1, end);
        }
    }

    public static void printArray(int[] arr, int target, int beginning, int middle, int end) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (i == middle && arr[middle] == target) 
            {
                System.out.println(i + ": " + arr[i] + " (Target found!)");
            } 
            else if (i == beginning && beginning == end && arr[beginning] != target) 
            {
                System.out.println(i + ": " + arr[i] + " (Last test, target not found!)");
            } 
            else if (i == beginning) 
            {
                System.out.println(i + ": " + arr[i] + " (Beginning)");
            } 
            else if (i == middle) 
            {
                System.out.println(i + ": " + arr[i] + " (Middle)");
            } 
            else if (i == end) 
            {
                System.out.println(i + ": " + arr[i] + " (End)");
            } 
            else 
            {
                System.out.println(i + ": " + arr[i]);
            }
        }
        System.out.println();
    }
}