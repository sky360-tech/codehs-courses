import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise
        import java.util.Scanner;

public class CYOA

{

private static Scanner input;

public static void main(String[] args)

{

input = new Scanner(System.in);

System.out.println("Welcome to Isekai Story 1245243");

System.out.println("Question 1: other race or human ?");

if(input.nextLine().equals("other race"))

{

//option A

System.out.println("Question 2. elf or dwarf? ");

if(input.nextLine().equals("X"))

{

System.out.println("Congratulation! Welcome to Elerouge.");

}

else

{

System.out.println("Congratulation! Welcome to Dwarfhood");

}

}

else

{

System.out.println("Congratulations! Welcome to Cleveland.");

}

}

}

}

}
    }
}// reviewed: 2026-08-10
