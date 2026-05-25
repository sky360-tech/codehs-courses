public class DuplicateRunner 
{
    public static void main (String[] args)
    {
        int[] numbers = {1, 1, 5, 3, 5, 5};
        
        System.out.println("Has Duplicates: " + Duplicates.hasDuplicates(numbers));
        System.out.println("Number of adjacent duplicate pairs: " + Duplicates.countAdjacentDuplicates(numbers));
    }
}