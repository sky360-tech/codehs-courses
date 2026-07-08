public class FindMinimum
{
    public static void main(String[] args)
    {
        int[] scores = {80, -01, 2, 68, -12};
        
        int minIndex = 0;
        
        for (int i = 1; i < scores.length; i++){
        	if (scores[i] < scores[minIndex]) {
        		minIndex = i;
        	}
        }
        
        System.out.print("Minimum number: ");
        System.out.println(scores[minIndex]);
        System.out.print("Found at index: ");
        System.out.println(minIndex);

    }
}// reviewed: 2026-07-08
