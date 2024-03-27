   import java.util.Scanner;

   public class input {
      public static void main(String[] args) { 
         Scanner myobj = new Scanner(System.in);

         System.out.println("Enter your name:");
         String username = myobj.nextLine();
         System.out.println("Your name is: " + username);

         System.out.println("Enter your age:");
         int age = myobj.nextInt();
         myobj.nextLine(); // Consume newline character
         System.out.println("Your age is: " + age);

         System.out.println("Enter your location:");
         String location = myobj.nextLine();
         System.out.println("Your location is: " + location);

         System.out.println("Enter values of a and b :");
         int a = myobj.nextInt();
         int b = myobj.nextInt();

         System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.println(a%b);
      }
   }
