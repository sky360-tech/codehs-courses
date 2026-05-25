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

        LineOrderAlgorithms.removeStudent(lineOrder, "Jessica Taylor");
        System.out.println("After removing Jessica Taylor: ");
        printLineOrder(lineOrder);

        // Uncomment the following lines to test Algorithm 2
        // lineOrder = LineOrderAlgorithms.reverseLine(lineOrder);
        // System.out.println("Reversed order: ");
        // printLineOrder(lineOrder);

        // Uncomment the following lines to test Algorithm 3
        // lineOrder = LineOrderAlgorithms.moveLastToFront(lineOrder);
        // System.out.println("After moving last to front: ");
        // printLineOrder(lineOrder);
    }

    public static void printLineOrder(ArrayList<String> lineOrder)
    {
        for (int i = 0; i < lineOrder.size(); i++)
        {
            System.out.println(i + 1 + ". " + lineOrder.get(i));
        }
    }
}