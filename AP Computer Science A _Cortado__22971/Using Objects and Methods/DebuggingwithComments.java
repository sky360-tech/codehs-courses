public class BuggyProgram 
{
    public static void main(String[] args) 
    {
        // method1(); 

        // Calling method2
        method2();

        // Calling method3
        method3();

        // method4(); 
    }

    /* // BUGGY METHOD 1: "string" must be capitalized as "String"
    public static void method1()
    {
        string hobby = "gardening";
        System.out.println(hobby);
    }
    */

    public static void method2()
    {
        System.out.println("Hi there!");
    }

    public static void method3()
    {
        double thisIsADouble = 5;
        System.out.println(thisIsADouble);
    }

    /* // BUGGY METHOD 4: "System.our" is a typo; should be "System.out"
    public static void method4()
    {
        int numSubjects = 6;
        System.our.println(numSubjects);
    }
    */
}// reviewed: 2026-06-29
