public class ternary {
   //?: 
   //condition ? if true: if false;

   public static void main(String[] args) {
      int a=20;
      int b=10;
      int c=5;
      int d= (a>b && a>c) ? a : (b>c ? b:c);
      System.out.println(d);
   }
}
