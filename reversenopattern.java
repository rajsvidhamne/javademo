// public class reversenopattern {
//    public static void main(String[] args) {

//      // Print the reverse number pattern
//       for (int i = 5; i >= 1; i--) {
//       for (int j = i; j >= 1; j--) {
//          System.out.print(j);
//       }
//       System.out.println();
//    }
// }
// }

public class reversenopattern {
   public static void main(String[] args) {
      for(int i=5;i>=1;i--){
         for(int j=1;j<=i;j++){
         System.out.print(j);
         }
         System.out.println();
      }
   }
}