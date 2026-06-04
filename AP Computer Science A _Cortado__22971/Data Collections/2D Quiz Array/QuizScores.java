public class QuizScores
{
    public static void main(String[] args)
    {
        int[][] quizzes = {{90, 85, 77, 61, 94, 89},
                            {94, 80, 85, 75, 88, 80},
                            {93, 81, 80, 78, 90, 85},
                            {89, 87, 82, 81, 96, 90}};

        System.out.println("==Row Major Traditional==");
        rowMajorTraditional(quizzes);

        System.out.println("==Row Major Enhanced==");
        rowMajorEnhanced(quizzes);
        
        System.out.println("==Column Major Traditional==");
        columnMajor(quizzes);
    }

    // Prints out the 2D array row by row using traditional for loops
    public static void rowMajorTraditional(int[][] arr)
    {
        for (int row = 0; row < arr.length; row++)
        {
            System.out.print("Row " + row + ": ");
            for (int col = 0; col < arr[0].length; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Prints out the 2D array row by row using enhanced for loops
    public static void rowMajorEnhanced(int[][] arr)
    {
        int count = 0;
        for (int[] row : arr)
        {
            System.out.print("Row " + count + ": ");
            for (int score : row)
            {
                System.out.print(score + " ");
            }
            count++;
            System.out.println();
        }
        System.out.println();
    }

    // Prints out the 2D array column by column using traditional for loops
    public static void columnMajor(int[][] arr)
    {
        for (int col = 0; col < arr[0].length; col++)
        {
            System.out.println("Column " + col + ":");
            for (int row = 0; row < arr.length; row++)
            {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
    }
}// reviewed: 2026-06-04
