//Q.11 - Write a program to reverse a 3-digit number. E.g.-Number : 132  Output : 231

import java.util.Scanner;
public class reverse {
   public static void main(String[] args) {
      int n;
      System.out.println("Enter any number");
      Scanner obj = new Scanner(System.in);
      n=obj.nextInt();

      while (n>0) {
         int r=n%10;
         System.out.print(r);
         n=n/10;
         
      }
   }
}
