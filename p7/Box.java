//Define a class 'Box' that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities[use this keyword].
import java.util.Scanner;

public class Box {
    int width, height, depth;
    
    Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    
    int getVolume() {
        return this.width * this.height * this.depth;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the dimensions of the box:");
        System.out.print("Width: ");
        int width = scanner.nextInt();
        
        System.out.print("Height: ");
        int height = scanner.nextInt();
        
        System.out.print("Depth: ");
        int depth = scanner.nextInt();
        
        Box b = new Box(width, height, depth);
        System.out.println("Volume of the box is " + b.getVolume());
        
        scanner.close();
    }
}
