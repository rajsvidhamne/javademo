//Q.1 - The length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

public class rectangle {
    public static void main(String[] args) {
    
    double length = 5;
    double breadth = 7;

       double area = length * breadth;

       double perimeter = 2 * (length + breadth);
    
    System.out.println("Area of the rectangle: " + area);
    System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
