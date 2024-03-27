public class fullpyramid {
   public static void main(String[] args) {
       int rows = 5; // Number of rows in the pyramid

       // Outer loop for rows
      for (int i = 1; i <= rows; i++) { 
           // Inner loop for spaces
         for (int j = 1; j <= rows - i; j++)
         {
               System.out.print(" ");
           }

           // Inner loop for printing asterisks
         for (int k = 1; k <= i; k++) {
               System.out.print("* ");
         }
           // Move to the next line
         System.out.println();
      }
   }
}

