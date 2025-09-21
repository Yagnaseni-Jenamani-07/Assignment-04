//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim ()' takes length and breadth of rectangle as parameters and the second method named as 'getArea ()' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. [use ‘this’ keyword]
import java.util.Scanner;
class Rectangle {
    int length;
    int breadth;
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea() {
        return length * breadth;
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle area = new Rectangle();
        area.setDim(length, breadth);
        System.out.println("The area of the rectangle is: " + area.getArea());
    }
}
