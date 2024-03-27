import java.util.Scanner;

public class largestnumber {
   public static void main(String[] args) {

    // Create a Scanner object for user input
   Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the first number
   System.out.print("Enter the first number: ");
   int number1 = scanner.nextInt();

    // Ask the user to enter the second number
   System.out.print("Enter the second number: ");
   int number2 = scanner.nextInt();

    // Ask the user to enter the third number
   System.out.print("Enter the third number: ");
   int number3 = scanner.nextInt();

    // Find the largest number
   int largestNumber = number1;
   if (number2 > largestNumber) {
      largestNumber = number2;
   }
   if (number3 > largestNumber) {
      largestNumber = number3;
   }

    // Display the largest number
   System.out.println("The largest number is: " + largestNumber);
}
}