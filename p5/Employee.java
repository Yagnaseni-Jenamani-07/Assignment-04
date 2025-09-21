//Write a program to declare a class Employee with data members empid, ename, dept, sal. Add a method getData(), putData() to accept and display the details of n employees. Define a driver class to create the objects of employee class and perform basic operations.
import java.util.Scanner;
class Employee {
    int empid;
    String ename;
    String dept;
    int sal;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        empid = sc.nextInt();
        System.out.println("Enter the employee name: ");
        ename = sc.next();
        System.out.println("Enter the employee department: ");
        dept = sc.next();
        System.out.println("Enter the employee salary: ");
        sal = sc.nextInt();
    }
    void putData() {
        System.out.println("Employee id: " + empid);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee department: " + dept);
        System.out.println("Employee salary: " + sal);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        System.out.println("Employee details: ");
        e.putData();
    }
}
