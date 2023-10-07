import java.util.Scanner;
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    public void displayInformation() {
        System.out.println("Officer Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

class Manager extends Employee {
    String department;

    public void displayInformation() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Officer officer = new Officer();
        System.out.print("Enter Officer's Name: ");
        officer.name = scanner.nextLine();
        System.out.print("Enter Officer's Age: ");
        officer.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Officer's Phone Number: ");
        officer.phoneNumber = scanner.nextLine();
        System.out.print("Enter Officer's Address: ");
        officer.address = scanner.nextLine();
        System.out.print("Enter Officer's Salary: ");
        officer.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Officer's Specialization: ");
        officer.specialization = scanner.nextLine();

        Manager manager = new Manager();
        System.out.print("Enter Manager's Name: ");
        manager.name = scanner.nextLine();
        System.out.print("Enter Manager's Age: ");
        manager.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Manager's Phone Number: ");
        manager.phoneNumber = scanner.nextLine();
        System.out.print("Enter Manager's Address: ");
        manager.address = scanner.nextLine();
        System.out.print("Enter Manager's Salary: ");
        manager.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Manager's Department: ");
        manager.department = scanner.nextLine();

        System.out.println("Employee Details:");
        officer.displayInformation();
        System.out.println();
        manager.displayInformation();
    }
}