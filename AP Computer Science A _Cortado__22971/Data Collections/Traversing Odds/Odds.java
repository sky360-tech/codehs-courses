import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for (int index = 1; index < 21; index++)
        {
            nums.add(index);
        }
        
        System.out.println("Original List:");
        System.out.println(nums);
        
        removeEvens(nums);
        
        System.out.println("New List:");
        System.out.println(nums);
    }
    
    public static void removeEvens(ArrayList<Integer> list)
    {
        list.removeIf(n -> n % 2 == 0);
        
      
    }
}// reviewed: 2026-06-17
