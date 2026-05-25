import java.util.ArrayList;

public class EarningsAnalysis {

    // Algorithm 1: Calculates the sum
    public static double calculateTotalEarnings(ArrayList<Double> list)
    {
        double total = 0;
        for (int i = 0; i < list.size(); i++)
        {
            total += list.get(i);
        }
        return total;
    }

    // Algorithm 2: Filters the list
    public static ArrayList<Double> getEarningsAbove(ArrayList<Double> list, double threshold)
    {
        ArrayList<Double> filteredList = new ArrayList<Double>();
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > threshold)
            {
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }
    
    // Algorithm 3: Inserts while maintaining order
    public static void insertInOrder(ArrayList<Double> list, double newVal)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            double currentVal = list.get(i);
            double nextVal = list.get(i + 1);
            
            if (newVal >= currentVal && newVal <= nextVal)
            {
                list.add(i + 1, newVal);
                return;
            }
        }
    }
}