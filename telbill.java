//Q.8- Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule: 
//Minimum Rs. 200 for up to 100 calls. 
//Plus Rs. 0.60 per call for next 50 calls. 
//Plus Rs. 0.50 per call for next 50 calls. 
//Plus Rs. 0.40 per call for any call beyond 200 calls.

import java.util.Scanner;
public class telbill {
   public static void main(String[] args) {
        // Constants for call rates and limits
      final double MINIMUM_CHARGE = 200.0;
      final int CALL_RATE1 = 100;
      final int CALL_RATE2 = 50;
      final int CALL_RATE3 = 50;
      final double RATE_FIRST_100_CALLS = 0.0; // No additional charge for first 100 calls
      final double RATE_NEXT_60_CALLS = 0.60;
      final double RATE_NEXT_50_CALLS = 0.50;
      final double RATE_BEYOND_200_CALLS = 0.40;
        // Create a Scanner object to read user input
      Scanner scanner = new Scanner(System.in);
        // Ask the user to input the number of calls
      System.out.print("Enter the number of calls: ");
      int totalCalls = scanner.nextInt();
        // Close the scanner to prevent resource leak
      scanner.close();
        // Calculate the telephone bill
      double bill = 0.0;
      if (totalCalls <= CALL_RATE1) {
            bill = MINIMUM_CHARGE;
      } else if (totalCalls <= CALL_RATE1 + CALL_RATE2) {
            bill = MINIMUM_CHARGE + (totalCalls - CALL_RATE1) * RATE_NEXT_50_CALLS;
      } else if (totalCalls <= CALL_RATE1 + CALL_RATE2 + CALL_RATE3) {
            bill = MINIMUM_CHARGE + CALL_RATE2 * RATE_NEXT_50_CALLS
                    + (totalCalls - CALL_RATE1 - CALL_RATE2) * RATE_NEXT_50_CALLS;
      } else {
            bill = MINIMUM_CHARGE + CALL_RATE2 * RATE_NEXT_50_CALLS
                    + CALL_RATE3 * RATE_NEXT_50_CALLS
                  + (totalCalls - CALL_RATE1 - CALL_RATE2 - CALL_RATE3)
                            * RATE_BEYOND_200_CALLS;
      }
        // Display the telephone bill
      System.out.println("Your monthly telephone bill is: Rs. " + bill);
   }
}
