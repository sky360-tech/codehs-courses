public class Duplicates 
{
    public static boolean hasDuplicates(int[] numArray)
    {
        for (int i = 0; i < numArray.length - 1; i++)
        {
            for (int j = i + 1; j < numArray.length; j++)
            {
                if (numArray[i] == numArray[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int countAdjacentDuplicates(int[] numArray) 
    {
        int count = 0;
        for (int i = 0; i < numArray.length - 1; i++)
        {
            if (numArray[i] == numArray[i + 1])
                count++;
        }
        return count;
    }
}// reviewed: 2026-06-11
