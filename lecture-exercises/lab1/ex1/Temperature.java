package ex1;

import java.util.Scanner;

public class Temperature
{
    public static double calculateCelsius(double fahrenheit)
    {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double calculateFahrenheit(double celsius)
    {
        return 9.0 / 5.0 * (celsius + 32);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.print("Write 1 for Fahrenheit to Celsius or" + " write 2 for Celsius to Fahrenheit: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Add temperature in Fahrenheit: ");
            fahrenheit = input.nextDouble();
            celsius = calculateCelsius(fahrenheit);
            System.out.printf("Degrees in Fahrenheit: %.1f, " + "Degrees in Celsius: %.3f", fahrenheit, celsius);
        }
        if (choice == 2)
        {
            System.out.print("\n\nAdd temperature in Celsius: ");
            celsius = input.nextDouble();
            fahrenheit = calculateFahrenheit(celsius);
            System.out.printf("Degrees in Celsius: %.1f, " + "Degrees in Fahrenheit: %.3f", celsius, fahrenheit);
        }
    }


}
