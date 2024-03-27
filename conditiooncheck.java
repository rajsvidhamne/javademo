//Q.5. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
public class conditiooncheck {
      public static void main(String[] args) {
          // Assign values to variables 'a' and 'b'
         int a = 55;
         int b = 70;

          // Check if both conditions are true
         boolean condition1 = a < 50;
         boolean condition2 = a < b;

          // Display the result
         System.out.println("Is 'a < 50' true? " + condition1);
         System.out.println("Is 'a < b' true? " + condition2);
         System.out.println("Are both conditions true? " + (condition1 && condition2));
      }
}

