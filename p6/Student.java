//Define a class Student having the attribute regNo,  stdName,  branch and CGPA. Write 2 methods to accept and display the student details.  Read the details of 3 students using an array of Student class object. Display the student details who has secured the highest CGPA.
import java.util.Scanner;
class Student {
    int regNo;
    String stdName;
    String branch;
    double CGPA;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration number: ");
        regNo = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the student name: ");
        stdName = sc.nextLine();
        System.out.println("Enter the branch: ");
        branch = sc.nextLine();
        System.out.println("Enter the CGPA: ");
        CGPA = sc.nextDouble();
    }
    void display() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Student Name: " + stdName);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + CGPA);
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner sc = new Scanner(System.in);
        
        // Accept details for all 50 students
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            students[i] = new Student();
            students[i].accept();
        }
        
        // Find the student with highest CGPA
        Student highestCGPAStudent = students[0];
        for (int i = 1; i < 3; i++) {
            if (students[i].CGPA > highestCGPAStudent.CGPA) {
                highestCGPAStudent = students[i];
            }
        }
        
        // Display the student with highest CGPA
        System.out.println("\n=== STUDENT WITH HIGHEST CGPA ===");
        highestCGPAStudent.display();
    }
}

