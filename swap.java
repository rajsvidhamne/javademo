//Q.7. Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
//1 - first program by using a third variable
//2 - second program without using any third variable
//( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)

//Q.1
public class swap {
      public static void main(String[] args) {
          // Values of variables 'a' and 'b'
         int a = 6;
         int b = 8;

          // Display original values
         System.out.println("Original values: a = " + a + ", b = " + b);

          // Swapping with a third variable
         int temp = a;
         a = b;
         b = temp;

          // Display swapped values
         System.out.println("Swapped values using third variable: a = " + a + ", b = " + b);
      }
}

//Q.2-

class swap1 {
   public static void main(String[] args) {
       // Values of variables 'a' and 'b'
      int a = 6;
      int b = 8;

       // Display original values
      System.out.println("Original values: a = " + a + ", b = " + b);

       // Swapping without using third variable
      a = a + b;
      b = a - b;
      a = a - b;

       // Display swapped values
      System.out.println("Swapped values without third variable: a = " + a + ", b = " + b);
   }
}
