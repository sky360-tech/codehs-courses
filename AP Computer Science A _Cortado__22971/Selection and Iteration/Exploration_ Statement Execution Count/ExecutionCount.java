public class ExecutionCount
{
    public static void main(String[] args)
    {
        int j = 1;
        while (j <= 5)
        {
            for (int k = 4; k > 0; k--)
            {
                System.out.println("*");
            }
            System.out.println();
            j++;
        }
    }
}