//Q. 6.	Any year is input by the user. Write a program to determine whether the year is a leap year or not.

import java.util.Scanner;
public class leapyearcheck {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int year = sc.nextInt();
      boolean isleapyear = false;
      if(year % 4 ==0){
         if(year % 100 == 0){
            isleapyear = (year % 400 ==0);
         } else{
            isleapyear = true;
         }
      }
      if(isleapyear){
         System.out.println(year + " is a leap year.");
      } else{
         System.out.println(year + " is not a leap year.");
      }
      sc.close();
   }
}
