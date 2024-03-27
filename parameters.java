   public class parameters {
      int id;
      String name;
      String location;

      // Constructor with parameters
      parameters(int id, String name, String location) {
         this.id = id;
         this.name = name;
         this.location = location;
         System.out.println(id+name+location);
      }
      parameters(int id)
      {
         this.id=id;
      }
   }
      class organic{
      public static void main(String[] args) {
         // Create object
         parameters p = new parameters(1, "rajsvi", "India");

         // Print values
         System.out.println(p.id + " " + p.name+ " " + p.location);
         parameters p1 = new parameters(2, "krystal", "new york");
         System.out.println(p1.id + " " + p1.name + " " + p1.location);
         parameters p2 = new parameters(3);
         System.out.println(p2.id);
      }  
   }
