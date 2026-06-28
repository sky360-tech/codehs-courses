public class UnitRunner
{
    public static void main(String[] args)
    {
        int fahrenheit = UnitConverter.celsiusToFahrenheit(0);
        System.out.print("Fahrenheit: ");
        System.out.println(fahrenheit);

        double kilograms = poundsToKilograms(20);
        System.out.print("Kilograms: ");
        System.out.println(kilograms);

        double kilometers = UnitConvertermilesToKilometers(65);
        System.out.print("Kilometers: ");
        System.out.println(kilometers);        
    }
}// reviewed: 2026-06-28
