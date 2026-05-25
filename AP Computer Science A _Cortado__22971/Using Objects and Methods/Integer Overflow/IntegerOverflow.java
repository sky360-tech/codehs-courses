public class IntegerOverflow
{
    public static void main(String[] args)
    {
       int min = Integer.MIN_VALUE;
       int max = Integer.MAX_VALUE;
       System.out.println("Minimum value: " + min);
       System.out.println("Maximum value: " + max);
       System.out.println("Min minus 1: " + (min - 1));
       System.out.println("Max plus 1: " + (max + 1));
       System.out.println("Max multiplied by 2: " + (max * 2));
       System.out.println("Min divided by 2: " + (min / 2));
    }
}