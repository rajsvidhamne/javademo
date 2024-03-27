public class logical {
   //&&,!,||
   //and
   // 0 0 0
   // 0 1 0
   // 1 0 0
   // 1 1 1
   //or
   // 0 0 0
   // 0 1 1
   // 1 0 1
   // 1 1 1
   //not
   // 0 1
   // 1 0

   public static void main(String[] args) {
      boolean x = true;
      boolean y = false;
      System.out.println((x && y));
      System.out.println((x || y));
      System.out.println(( !x));
      System.out.println(( !y));
   }
}
