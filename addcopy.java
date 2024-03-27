public class addcopy {
   int a,b;
   addcopy(int a, int b){
      this.a=a;
      this.b=b;
   }
   addcopy(addcopy obj){
      this.a=obj.a;
      this.b=obj.b;
   }
}
class multiple{
   public static void main(String[] args) {
      addcopy obj = new addcopy(20 , 10);
      System.out.println(obj.a+obj.b);
      addcopy obj1=new addcopy(obj);
      System.out.println(obj1.a-obj.b);
   }
}
