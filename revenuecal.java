//Q.3 - 3.	Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity. Write a program that asks the user to enter product price and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.

import java.util.Scanner;
public class revenuecal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter product price: ");

      double price = sc.nextDouble();

      System.out.print("Enter quantity solde: ");
      int quantity = sc.nextInt();

      double revenue = price * quantity;

      if (revenue > 5000) {
         double discount = 0.10 * revenue;
         double netRevenue = revenue - discount;
         System.out.println("Discount offered: " + discount);
         System.out.println("Net revenue after discount: " + netRevenue);
      } else {
         System.out.println("Revenue: " + revenue);
      }
      sc.close();
   }
}
