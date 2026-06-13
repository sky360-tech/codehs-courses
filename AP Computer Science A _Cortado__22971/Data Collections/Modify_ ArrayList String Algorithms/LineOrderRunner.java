import java.util.ArrayList;

public class LineOrderRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> lineOrder = new ArrayList<>();

        lineOrder.add("John Smith");
        lineOrder.add("Emily Davis");
        lineOrder.add("Michael Johnson");
        lineOrder.add("Aisha Brown");
        lineOrder.add("David Wilson");
        lineOrder.add("Laura Martinez");
        lineOrder.add("James Anderson");
        lineOrder.add("Jessica Taylor");
        lineOrder.add("Jessica Walker");
        lineOrder.add("Chris Thomas");
        lineOrder.add("Amanda White");
        lineOrder.add("Julio Marquez");
        lineOrder.add("Emma Clark");
        lineOrder.add("Joshua Lewis");
        lineOrder.add("Olivia Robinson");
        
        System.out.println("Original order: ");
        printLineOrder(lineOrder);
        System.out.println("*************************");
        
        // Test shiftLeft
        System.out.println("\nTesting shiftLeft (John Smith should move to the end):");
        ArrayList<String> shiftedList = LineOrderAlgorithms.shiftLeft(lineOrder);
        printLineOrder(shiftedList);
        
        // Test checkPairs
        System.out.println("\nTesting checkPairs:");
        
        // These two are adjacent in the original list
        boolean pair1 = LineOrderAlgorithms.checkPairs("John Smith", "Emily Davis", lineOrder);
        System.out.println("Are John Smith and Emily Davis adjacent? " + pair1);
        
        // These two are NOT adjacent
        boolean pair2 = LineOrderAlgorithms.checkPairs("John Smith", "Olivia Robinson", lineOrder);
        System.out.println("Are John Smith and Olivia Robinson adjacent? " + pair2);
    }
    
    public static void printLineOrder(ArrayList<String> lineOrder)
    {
        for (int i = 0; i < lineOrder.size(); i++)
        {
            System.out.println(i+1 + ". " + lineOrder.get(i));
        }
    }
}// reviewed: 2026-06-13
