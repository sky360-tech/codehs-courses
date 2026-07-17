public class ExtractDigits {

    public static void main(String[] args) {
            int number = 2938724; // Input number
        extractDigits(number);
    }

    public static void extractDigits(int number) {
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            System.out.println(digit); // Print the digit
            number = number / 10; // Remove the last digit
        }
    }
}// reviewed: 2026-07-17
