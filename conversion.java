//Q.8 - 8. Write a program to convert Fahrenheit into Celsius.

   import java.util.Scanner;
   public class conversion {
   public static void main(String[] args) {
        // Create a Scanner object for user input
      Scanner scanner = new Scanner(System.in);
        // Ask the user to enter temperature in Fahrenheit
      System.out.print("Enter temperature in Fahrenheit: ");
      double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature
      System.out.println("Temperature in Celsius: " + celsius + " °C");

        // Close the Scanner object
      scanner.close();
   }
}

