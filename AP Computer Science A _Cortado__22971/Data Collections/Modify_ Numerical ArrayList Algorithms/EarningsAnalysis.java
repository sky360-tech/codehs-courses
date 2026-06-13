import java.util.ArrayList;

public class EarningsAnalysis
{
    // Task 1: Returns the average (Sum / Count)
    public static double findAverage(ArrayList<Double> list)
    {
        if (list.size() == 0) return 0.0; // Avoid division by zero
        
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum / list.size(); 
    }

    // Task 2: Returns the COUNT (int) of jobs instead of a new list
    public static int greaterThanNum(ArrayList<Double> list, double num)
    {
        int count = 0; // Initialize a counter
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > num)
            {
                count++; // Increment count when condition is met
            }
        }
        return count;
    }

    // Task 3: Handles edge cases for inserting at index 0 or at the end
    public static void insertInOrder(ArrayList<Double> list, double num)
    {
        // Edge Case: If list is empty or num is smaller than the first element
        if (list.size() == 0 || num <= list.get(0)) {
            list.add(0, num);
            return;
        }

        // Standard Case: Insert between two elements
        for (int i = 0; i < list.size() - 1; i++)
        {
            double currentNum = list.get(i);
            double nextNum = list.get(i + 1);

            if (num >= currentNum && num <= nextNum)
            {
                list.add(i + 1, num);
                return;
            }
        }

        // Edge Case: If num is larger than everything else, add to the end
        list.add(num);
    }
}// reviewed: 2026-06-13
