package com.mycompany.thermoconvert;
import java.util.Scanner;

public class ThermoConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter!");
        System.out.println("This application allows you to convert temperatures between Celsius, Fahrenheit, and Kelvin.");

        while (true) {
            System.out.print("Do you want to proceed? (Enter 'y' to proceed, 'n' to exit): ");
            char proceedChoice = scanner.next().charAt(0);

            if (proceedChoice != 'y') {
                System.out.println("Exiting Temperature Converter. Goodbye!");
                return;
            }

            while (true) {
                System.out.println("Choose the conversion type:");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                System.out.println("3. Celsius to Kelvin");
                System.out.println("4. Kelvin to Celsius");
                System.out.println("5. Fahrenheit to Kelvin");
                System.out.println("6. Kelvin to Fahrenheit");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                if (choice == 7) {
                    System.out.println("Exiting Temperature Converter. Goodbye!");
                    return;
                }

                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
                }

                double temperature;
                System.out.print("Enter temperature value: ");
                temperature = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                        break;
                    case 2:
                        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                        break;
                    case 3:
                        System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                        break;
                    case 4:
                        System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                        break;
                    case 5:
                        System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                        break;
                    case 6:
                        System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }

                System.out.print("Do you want to convert more temperatures? (y/n): ");
                char continueChoice = scanner.next().charAt(0);
                if (continueChoice != 'y') {
                    System.out.println("Exiting Temperature Converter. Goodbye!");
                    return;
                }
            }
        }
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}
