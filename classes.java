//access modifier class <class name
//{
   //data member, method,constructor,nested class,interface
   //}
// public class classes {
//    float id;
//    String name;
//    public static void main(String[] args) {
//       //create my object
//       classes obj = new classes();
//       classes o = new classes();
//       o.id = 2;
//       System.out.println(o.id);
//       System.out.println(obj.id);
//       System.out.println(obj.name);
//    }
// }

// class student{
//    int id =1;
//    String name="rajsvi";
//    //return type function
//    void display(){
//       System.out.println(id + " " + name);
//    }
//    void print(){
//       System.out.println("hi");
//    }
// }

// public class classes {

//    public static void main(String[] args) {
//       //creating objects of the same class
//       student o = new student();
//       System.out.println(o.id);
//       o.display();
//       o.print();
//    }
// }

class student{
   int a =77;
   int b =20;
   //return type function
   void add(){
      System.out.println(a+b);
   }
   void sub(){
      System.out.println(a-b);
   }
}

public class classes {

   public static void main(String[] args) {
      //creating objects of the same class
      student o = new student();
      o.add();
      o.sub();
}
}