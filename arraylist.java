import java.util.ArrayList;

public class arraylist {
   public static void main(String[] args) {
      ArrayList <Integer> o= new ArrayList<Integer>();
      //adding element in list
      o.add(10);
      o.add(20);
      o.add(30);
      o.set(1,15); 
      System.out.println(o.get(2));
      for (int b:o){
         System.out.println(b);
      }
      o.add(40);
      System.out.println(o);
      o.add(50);
      System.out.println(o);
   }
}
