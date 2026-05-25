public class Gradebook
{
    public static void main(String[] args)
    {
        // MODIFY: Create the gradebook directly without separate quiz variables
        int[][] gradebook = {
            {90, 87, 86, 56, 96}, // Quiz 1
            {65, 76, 87, 84, 93}, // Quiz 2
            {85, 56, 91, 90, 65}, // Quiz 3
            {70, 60, 78, 31, 65}  // Quiz 4
        };
        
        // Print the gradebook
        System.out.println("\tZara\tDiego\tMei\tOmar\tSaanvi");
        print2D(gradebook);
        
        // Access and print Mei's quiz 1 grade
        int grade = gradebook[0][2];
        System.out.println("\nMei's grade for quiz 1: " + grade);

        // TASK: Print Omar's quiz 4 score (Row 3, Column 3)
        System.out.println("Omar's grade for quiz 4: " + gradebook[3][3]);

        // TASK: Change Diego's quiz 3 score to 68 and print (Row 2, Column 1)
        gradebook[2][1] = 68;
        System.out.println("Diego's updated grade for quiz 3: " + gradebook[2][1]);
        
        // EXTENSION: Call print1D for Quiz 2 (Row 1)
        System.out.print("\nPrinting Quiz 2 row only: ");
        print1D(gradebook[1]);
    }
    
    public static void print2D(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Quiz " + (i + 1) + ":\t");
            for (int num: array[i])
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    // EXTENSION: Method to print a 1D array
    public static void print1D(int[] array)
    {
        for (int num : array)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}