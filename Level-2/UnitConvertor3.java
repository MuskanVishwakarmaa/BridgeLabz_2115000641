import java.util.Scanner;

public class UnitConvertor3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a conversion option:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Kilograms to Pounds");
            System.out.println("5. Gallons to Liters");
            System.out.println("6. Liters to Gallons");
            System.out.println("7. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + " Fahrenheit is " +
                            convertFahrenheitToCelsius(fahrenheit) + " Celsius");
                    break;

                case 2:
                    System.out.print("Enter Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println(celsius + " Celsius is " +
                            convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
                    break;

                case 3:
                    System.out.print("Enter Pounds: ");
                    double pounds = sc.nextDouble();
                    System.out.println(pounds + " Pounds is " +
                            convertPoundsToKilograms(pounds) + " Kilograms");
                    break;

                case 4:
                    System.out.print("Enter Kilograms: ");
                    double kilograms = sc.nextDouble();
                    System.out.println(kilograms + " Kilograms is " +
                            convertKilogramsToPounds(kilograms) + " Pounds");
                    break;

                case 5:
                    System.out.print("Enter Gallons: ");
                    double gallons = sc.nextDouble();
                    System.out.println(gallons + " Gallons is " +
                            convertGallonsToLiters(gallons) + " Liters");
                    break;

                case 6:
                    System.out.print("Enter Liters: ");
                    double liters = sc.nextDouble();
                    System.out.println(liters + " Liters is " +
                            convertLitersToGallons(liters) + " Gallons");
                    break;

                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}

