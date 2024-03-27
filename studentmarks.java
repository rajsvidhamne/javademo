//Q.6 - If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
public class studentmarks {
      public static void main(String[] args) {
      
            int subject1 = 78;
            int subject2 = 45;
            int subject3 = 62;

            int totalMarks = subject1 + subject2 + subject3;

      double perMarks =  totalMarks / 3;
      
      System.out.println("Total marks: " + totalMarks);
      System.out.println("Percentage marks: " + perMarks + "%");
      }
}


