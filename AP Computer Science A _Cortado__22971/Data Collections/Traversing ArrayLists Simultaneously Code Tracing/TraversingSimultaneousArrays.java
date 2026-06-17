import java.util.ArrayList;

public class TraversingSimultaneousArrays
{
    public static void main(String[] args)
    {
        // Creates an ArrayList of integers
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(0);

        // Creates a second ArrayList of integers
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(9);
        list2.add(12);

        // Prints out the ArrayLists
        System.out.println("Array 1:");
        printArray(list1);

        System.out.println("Array 2:");
        printArray(list2);

        // Initialize summedList with sumArrays(list1, list2)
        ArrayList<Integer> summedList = sumArrays(list1, list2);

        // Print out the summed ArrayList
        System.out.println("\nSum of Array 1 and Array 2:");
        printArray(summedList);
    }

    // Sums the elements at the same index of two ArrayLists. Assumes
    // that both incoming lists are the same length.
    public static ArrayList<Integer> sumArrays(ArrayList<Integer> listA, ArrayList<Integer> listB)
    {
        ArrayList<Integer> summedList = new ArrayList<Integer>();

        for (int index = 0; index < listA.size(); index++)
        {
            int valueA = listA.get(index);
            int valueB = listB.get(index);
            int sum = valueA + valueB;
            summedList.add(sum);
        }

        return summedList;
    }

    // Prints the elements of an ArrayList on one line
    public static void printArray(ArrayList<Integer> array)
    {
        for (Integer elem : array)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
// reviewed: 2026-06-17
