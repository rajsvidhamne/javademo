//Q. 5 -	Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.

import java.util.Scanner;
public class noclassifier {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number: ");
      double number = sc.nextDouble();

      if(number > 0){
         System.out.println(number + " is a positive");
      }else if (number < 0){
         System.out.println(number + " is a negative");
      } else {
         System.out.println(number + " is zero");
      }
      sc.close();
   }
}
