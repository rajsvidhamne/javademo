public class copyconstructor {
   int id;
   String name;
   //initialize constructor
   copyconstructor(int id, String name){
      this.id=id;
      this.name=name;
   }
   copyconstructor(copyconstructor c){
      this.id=c.id;
      this.name=c.name;
   }

}
class student{
   public static void main(String[] args) {
      //create object
      copyconstructor c = new copyconstructor(1, "rajsvi");
      System.out.println(c.id+c.name);
      copyconstructor d = new copyconstructor(c);
      System.out.println(d.id+d.name);
   }
}
