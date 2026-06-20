public class StringComparison 
{
    public static void main(String[] args) 
    {
        String first = new String("Java");
        String second = new String("Java");
        String third = "Java";
        String fourth = "Java";
        
        String fifth = first;
        String sixth = third;

        System.out.println("first.equals(second): " + first.equals(second));
        System.out.println("first == second: " + (first == second));
        System.out.println("first == third: " + (first == third));
        System.out.println("third == fourth: " + (third == fourth));
        
        System.out.println();
        System.out.println("fifth == first: " + (fifth == first));
        System.out.println("sixth == third: " + (sixth == third));
    }
}// reviewed: 2026-06-20
