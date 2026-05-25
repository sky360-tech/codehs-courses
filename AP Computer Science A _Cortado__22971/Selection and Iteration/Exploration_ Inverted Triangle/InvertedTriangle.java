public class InvertedTriangle
{
    public static void main(String[] args)
    {  
       makeInvertedTriangle();
    }
     
    public static void makeInvertedTriangle()
    {
         for (int i = 0; i <= 6; i++)
    {
        // We change the inner loop to always run 7 times 
        // so every row has the same width
        for (int j = 1; j <= 7; j++)
        {
            // If we haven't reached the "cutoff" point for stars...
            if (j <= 7 - i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print("-");
            }
        }
        System.out.println("");
   }  } 
}