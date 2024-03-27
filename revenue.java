import java.util.Scanner;

public class revenue {
   public static void main(String[] args) {

    // Create a Scanner object for user input
   Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the product price
   System.out.print("Enter the product price: ");
   double price = scanner.nextDouble();

    // Ask the user to enter the quantity sold
   System.out.print("Enter the quantity sold: ");
   int quantity = scanner.nextInt();

    // Calculate the revenue
    double revenue = price * quantity;

    // Check if a discount is applicable
   if (revenue > 5000) {
      // Calculate the discount
      double discount = revenue * 0.10;
      // Calculate the net revenue
      revenue = revenue - discount;
      // Display the discount and net revenue
      System.out.println("A discount of 10% is offered, resulting in a net revenue of: " + revenue);
   } else {
      // Display the revenue
      System.out.println("The revenue is: " + revenue);
   }
}
}