public class ArrayAverage
{
    public static double getAverage(int[] arr)
    {
        double sum = 0;
        for (int num : arr)
        {
            sum += num;
        }
        return sum / arr.length;
    }
}// reviewed: 2026-06-05
