//Write a program to create a class named 'Student' with members 'name', 'roll_no', 'branch'. Declare two methods to input the student details and display the details of the student. Create a driver class to test the functionalities of the above class.

import java.util.Scanner;

// Student class with required members and methods
public class Student {
    // Member variables
    String name;
    int roll_no;
    String branch;
    
    // Method 1: To input student details
    public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        this.name = sc.nextLine();
        System.out.println("Enter the roll number of the student: ");
        this.roll_no = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("Enter the branch of the student: ");
        this.branch = sc.nextLine();
    }
    
    // Method 2: To display student details
    public void displayStudentDetails() {
        System.out.println("The details of the student are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Roll number: " + this.roll_no);
        System.out.println("Branch: " + this.branch);
    }
}

// Driver class to test the functionalities
class StudentDriver {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student = new Student();
        
        // Calling the input method
        student.inputStudentDetails();
        
        // Calling the display method
        student.displayStudentDetails();
    }
}

