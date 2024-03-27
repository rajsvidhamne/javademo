//Q.2 - 1.	Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.

import java.util.Scanner;

public class oddeven {
   public static void main(String[] args) {
        // Create a Scanner object to read user input
      Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

        // Check if the number is even or odd
      if (number % 2 == 0) {
            System.out.println(number + " is even.");
      } else {
            System.out.println(number + " is odd.");
      }

        // Close the scanner to prevent resource leak
      scanner.close();
   }
}

