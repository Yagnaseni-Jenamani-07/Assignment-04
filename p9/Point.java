//Design a class Point with data members as xCo and yCo. The class should have a parameterized constructor to initialize its data members. Define a method distanceBetPoints() which returns the distance between two points.

import java.util.Scanner;

public class Point {
    private int xCo;
    private int yCo;

    public Point(int xCo, int yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }

    public double distanceBetPoints(Point p) {
        return Math.sqrt(Math.pow(xCo - p.xCo, 2) + Math.pow(yCo - p.yCo, 2));
    }
}

class PointTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get coordinates for first point
            System.out.print("Enter x-coordinate for point 1: ");
            int x1 = scanner.nextInt();
            System.out.print("Enter y-coordinate for point 1: ");
            int y1 = scanner.nextInt();
            
            // Get coordinates for second point
            System.out.print("Enter x-coordinate for point 2: ");
            int x2 = scanner.nextInt();
            System.out.print("Enter y-coordinate for point 2: ");
            int y2 = scanner.nextInt();
            
            // Create Point objects with user input
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            
            // Calculate and display distance
            double distance = p1.distanceBetPoints(p2);
            System.out.println("Distance between the two points: " + distance);
        }
    }
}