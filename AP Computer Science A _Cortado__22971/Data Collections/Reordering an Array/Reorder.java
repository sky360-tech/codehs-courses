public class Reorder
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Print the original array
        System.out.print("Original Array:  ");
        for (int number : numbers){
             System.out.print(number + " ");
        }
        
        // Create default array that is the same size as numbers
        int[] temp = new int[numbers.length]; 
        
        // Loop through all items except the last item
        for (int i = 0; i < numbers.length - 1; i++){
            // For each item in numbers, add it into temp at 
            // an index that is one greater than before
            temp[i + 1] = numbers[i]; 
        }
        
        // Move the last item to the new first position
        temp[0] = numbers[numbers.length - 1];
        // Point numbers variable to the temp array
        numbers = temp;
        
        System.out.println();
        
        // Print out reordered numbers array
        System.out.print("Reordered Array: ");
        for (int number : numbers){
             System.out.print(number + " ");
        }
    }
}