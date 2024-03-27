public class invertedpyramid {
   public static void main(String[] args) {
       int r = 5; // Number of rows in the pyramid

       // Outer loop for rows
      for (int i = r; i >= 1; i--) {
           // Inner loop for printing spaces
         for (int j = r; j > i; j--) {
               System.out.print(" ");
         }
           // Inner loop for printing asterisks
           for (int k = 1; k <= 2 * i - 1; k++) {
               System.out.print("*");
         }
           // Move to the next line
         System.out.println();
      }
   }
}
