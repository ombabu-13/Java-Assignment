class Employee {
    String name = "Ombabu";
    int salary = 50000;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        super.displayEmployee(); // Access parent class method
        System.out.println("Department: " + department);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayManager();
    }
}