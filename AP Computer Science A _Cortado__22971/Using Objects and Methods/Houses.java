public class Houses
{
    public static void main(String[] args)
    {
        // House 1: Roof, 2 levels, and a sidewalk
        buildRoof();
        buildLevel();
        buildLevel();
        buildSidewalk();

        // Blank line between houses
        System.out.println();

        // House 2: Roof, 4 levels, and a sidewalk
        buildRoof();
        buildLevel();
        buildLevel();
        buildLevel();
        buildLevel();
        buildSidewalk();
    }

    // Method to build the triangle roof
    public static void buildRoof() 
    {
        System.out.println("   +   ");
        System.out.println("  +++  ");
        System.out.println(" +++++ ");
        System.out.println("+++++++");
    }

    // Method to build one square level of the house
    public static void buildLevel() 
    {
        System.out.println("|     |");
        System.out.println("|  #  |");
        System.out.println("|     |");
        System.out.println("+++++++");
    }

    // Method to build the sidewalk path
    public static void buildSidewalk() 
    {
        System.out.println("   =   ");
        System.out.println("   =   ");
        System.out.println("====   ");
    }
}