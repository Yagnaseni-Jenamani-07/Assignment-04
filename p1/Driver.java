//Write a program to print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average. Define another driver class to demonstrate the basic operation.
import java.util.Scanner;           //importing the Scanner class

// Class to calculate and print average
class Average {
    // Method to calculate and print the average of three numbers
    public void calculateAndPrintAverage(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        System.out.println("The average of three numbers is: " + average);
    }
}

// Driver class to demonstrate the basic operation
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creating an object of the Scanner class to take input from the user
        
        //taking input from the user
        System.out.println("Enter the three numbers: "); //printing the message to the user
        double a = sc.nextDouble(); //taking input from the user
        double b = sc.nextDouble(); //taking input from the user
        double c = sc.nextDouble(); //taking input from the user
        
        // Creating an object of Average class and calling the method
        Average avg = new Average();
        avg.calculateAndPrintAverage(a, b, c);
        
        sc.close(); // closing the scanner
    }
}