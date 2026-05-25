import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> nums)
    {
        for (Double n : nums)
        {
            System.out.println(n);
        }
    }

    public static void condense(ArrayList<Double> nums)
    {
        for (int i = 0; i < nums.size(); i++)
        {
            double product = nums.get(i) * nums.get(i + 1);
            
            nums.set(i, product);
            
            nums.remove(i + 1);
        }
    }

    public static void duplicate(ArrayList<Double> nums)
    {
        int originalSize = nums.size();
        for (int i = 0; i < originalSize; i++)
        {
            nums.add(nums.get(i));
        }
    }
}