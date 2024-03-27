public class multiarr {
   public static void main(String[] args) {
      int a[][] = {{10,20,30,40},{50,60,70,80}};
      //System.out.println(a[1][3]);

      System.out.println(a.length);
      for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
            System.out.println(a[i][j]);
            
         }
      }
   }
}
