public class foreach {
   public static void main(String[] args) {
      //for(type var:array) {statement}
      int a[] = {1,2,3,4,5};
      for(int b:a){
         System.out.println(b);
      }
   }
}
//when you want to modify the array it is not appropriate
//do not keep a track of your array index
//only iterates in forward way
//cannot do 2 decisions at a time