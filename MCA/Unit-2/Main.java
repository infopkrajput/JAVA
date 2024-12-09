import java.util.Scanner;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Salary:$" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bibhuti", 50000);
        emp1.displayDetails();
    }
}