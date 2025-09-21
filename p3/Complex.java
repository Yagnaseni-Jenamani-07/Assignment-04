//Declare a class Complex with member real and imaginary part. Define a method initialise() to input the two complex numbers, show() to display the complex number and add() to add the two complex numbers. Declare another class to illustrate the operations of the Complex class.
import java.util.Scanner;

public class Complex {
     double real;
     double imaginary;

    public void initialise(double realPart, double imaginaryPart) {
        real = realPart;
        imaginary = imaginaryPart;
    }
    
    public void initialise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number for real part: ");
            scanner.next(); // consume the invalid input
        }
        real = scanner.nextDouble();
        
        System.out.println("Enter the imaginary part: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number for imaginary part: ");
            scanner.next(); // consume the invalid input
        }
        imaginary = scanner.nextDouble();
    }

    public void show() {
        if (imaginary >= 0) {
            System.out.println("Complex number: " + real + " + " + imaginary + "i");
        } else {
            System.out.println("Complex number: " + real + " - " + Math.abs(imaginary) + "i");
        }
    }

    public Complex add(Complex other) {
        Complex result = new Complex();
        result.real = this.real + other.real;
        result.imaginary = this.imaginary + other.imaginary;
        return result;
    }
} 

// Test class to demonstrate Complex operations
class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.initialise();
        c1.show();
        Complex c2 = new Complex();
        c2.initialise();
        c2.show();
        Complex c3 = c1.add(c2);
        System.out.println("Sum of the two complex numbers:");
        c3.show();
    }
}
