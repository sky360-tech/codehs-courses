public class PrimeNumbers
{
    public static void main(String[] args)
    {
        isPrime(17);
        isPrime(24);
    }

    // Determines if a number is prime and prints the results
    public static void isPrime(int num)
    {
        // Loops through every number from 2 up to num
        for (i = 2; i <= num, i++)
        {
            // Checks if i divides evenly into num
            if (num % i == 0)
            {
                // If so, print the result and exit out of the method
                System.out.println(num + " is not a prime number.");
                return;
            }
        System.out.println(num + " is a prime number!");
    }
}// reviewed: 2026-06-20
