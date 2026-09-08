QUESTION-1
import java.util.Scanner;
class Student {
    private int studentId;
    private String name;
    private double cgpa;
    public Student(int studentId, String name, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
    }
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Student Details Displayed");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        Student s = new Student(id, name, cgpa);
        s.displayDetails();
        sc.close();
    }
}





QUESTION-2
import java.util.Scanner;
class Employee {
    private int empId;
    private String empName;
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public void updateDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        System.out.println("Employee Record Updated");
    }
    public void display() {
        System.out.println("ID: " + this.empId + ", Name: " + this.empName);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(100, "Default");

        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name to update: ");
        String name = sc.nextLine();

        emp.updateDetails(id, name);
        emp.display();
        sc.close();
    }
}





QUESTION-3
import java.util.Scanner;
class CollegeStudent {
    private int studentId;
    private String studentName;
    private static String collegeName = "Alliance University";
    public CollegeStudent(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public void display() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName);
        System.out.println("College Name: " + collegeName);
        System.out.println("College Name Displayed");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        CollegeStudent s = new CollegeStudent(id, name);
        s.display();
        sc.close();
    }
}




QUESTION-4

import java.util.Scanner;
class Product {
    private int productId;
    private String productName;
    private double price;
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        System.out.println("Product Record Created");
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Product Record Updated");
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Product Details Displayed");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        Product prod = new Product(id, name, price);
        System.out.print("Enter New Price to Update: ");
        double updatedPrice = sc.nextDouble();
        prod.setPrice(updatedPrice);
        prod.displayDetails(); 
        sc.close();
    }
}


