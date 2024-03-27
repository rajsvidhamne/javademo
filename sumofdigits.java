//Q.10 -  Write a program to calculate the sum of the digits of a 3-digit number. Number : 132  Output : 6
   import java.util.Scanner;
   public class sumofdigits {
   public static void main(String[] args) {
      int n,r,sum=0;
      System.out.println("Enter any number");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();

      while(n>0){
         r=n%10;
         sum=sum+r;
         n=n/10;
      }
      System.out.print("The sum of the digits is: " +sum);
   }
}
