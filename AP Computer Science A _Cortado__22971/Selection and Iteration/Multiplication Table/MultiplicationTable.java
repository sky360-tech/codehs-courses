public class MultiplicationTable
{
    public static void main(String[] args)
    {  
       makeMultiplicationTable();
    }
     
    // Prints a multiplication table
    public static void makeMultiplicationTable()
    {
        for (int line = 1; line <= 5; line++)
        {
            for (int number = 1; number <= 5; number++)
            {
                System.out.print(line * number + "\t");
            }
            System.out.println(); 
        }
    }
}// reviewed: 2026-06-23
