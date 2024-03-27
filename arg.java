public class arg {
   public static void main(String[] args) {
      System.out.println("passed a string");
      System.out.println("Hello");
      int a=10;
      System.out.println(a);
      for(int i=0; i<args.length;i++){
         System.out.println(args[i]);
      }
   }
}
