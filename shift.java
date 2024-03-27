public class shift {
   //<<(left shift), >>(right shift), >>>(unsigned right shift)
   //left shift-moves all the bits by a number to left
   //right shift-moves all the bits by a number to right
   //unsigned right shifts the bits just like right shift but it will zero instead of right
   
   public static void main(String[] args) {
      int x=4;
      System.out.println(x<<2);
      //8=>0000 1000
      //8=>0010 0000 =32

      System.out.println(x>>2);
      //8=>0000 1000
      //8=>0000 0010 = 2

      System.out.println(x>>>2);
      //4=>0000 0100
      //4=>0001 0000 =16
      //4=>0000 0001 =1 

      byte a=8;
      byte b=-5;
      System.out.println(a>>>2);
      System.out.println(b>>>2);
      //8=> 0000 1000
      //8=> 0000 0010
   }
}
