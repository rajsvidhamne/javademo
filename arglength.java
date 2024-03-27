public class arglength {
      public static void main(String[] args) {
      if (args.length >= 2) {
         String name = "rajsvi";

         if (name.equals(args[1])) {
               System.out.println("Your first argument is: " + args[0]);
               System.out.println(args.length + " ");
         } else {
               System.out.println("Your second argument is: " + args[1]);
               System.out.println(args.length);
         }
      } else {
         System.out.println("Insufficient arguments provided.");
      }
   }
}
