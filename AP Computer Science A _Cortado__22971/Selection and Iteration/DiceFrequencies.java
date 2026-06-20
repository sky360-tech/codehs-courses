import java.util.Scanner;

public class DiceFrequencies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many times would you like to roll the die?");
        int count = input.nextInt();
        
        rollDice(count);
    }
    
    public static void rollDice(int rolls)
    {
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
        
        for (int i = 0; i < rolls; i++)
        {
           
            int roll = (int)(Math.random() * 6) + 1;
            
            if (roll == 1) { ones++; }
            else if (roll == 2) { twos++; }
            else if (roll == 3) { threes++; }
            else if (roll == 4) { fours++; }
            else if (roll == 5) { fives++; }
            else if (roll == 6) { sixes++; }
        }
        
        System.out.println("Number of sixes: " + sixes);
        System.out.println("Number of fives: " + fives);
        System.out.println("Number of fours: " + fours);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of ones: " + ones);
    }
}// reviewed: 2026-06-20
