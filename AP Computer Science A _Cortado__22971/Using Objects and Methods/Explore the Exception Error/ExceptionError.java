/*Compile and Run the Java Program:

1. Press the Run button. This will open up a command line prompt.

2. Compile the program by entering `javac` followed by the name of the program file: javac ExceptionError.java

3. If the program does not compile successfully, press Stop and fix the error. Then start at step #1 again.

4. Once the program has successfully compiled, enter the command to run the program by entering `java` followed by the program's class name without the ".java" at the end: java ExceptionError

Compile and run the program at least twice.

- The first time, enter in a letter or word when you are prompted to enter a number. What happens?
- The second time, enter in a whole number when you are prompted to enter a number. What happens?
*/

import java.util.Scanner;

public class ExceptionError
{
    public static void main(String[] args)
    {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int myNum = input.nextInt();
        System.out.println("What a great number!");
    }
}// reviewed: 2026-07-01
