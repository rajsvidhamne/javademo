//Q.4 -Write a program that asks the user to enter a numbers in three variables and then displays the largest number.

import java.util.Scanner;
public class largenofind {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the first number: ");
      double number1 = sc.nextDouble();

      System.out.println("Enter the second number: ");
      double number2 = sc.nextDouble();

      System.out.println("Enter the third number");
      double number3 = sc.nextDouble();

      double largestnumber = number1;
      
      if (number2 > largestnumber) {
         largestnumber = number2;
      }

      if(number3 > largestnumber){
         largestnumber = number3;
      }
      System.out.println("The largest number is:" + largestnumber);

      sc.close();
   }
}
