//Q.2 - 2.	Write a program that asks the user to enter a number and displays the absolute value of that number.

import java.util.Scanner;
public class absolute {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number");

      double number = sc.nextDouble();

      double absolutevalue = Math.abs(number);

      System.out.println("The absolute value of " + number + " is " + absolutevalue);

      sc.close();
   }
}
