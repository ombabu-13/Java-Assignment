import java.util.Scanner;

class Employee {
    Integer empId;
    Double basicSalary;
    Double bonus;

    Employee(Integer empId, Double basicSalary, Double bonus) {
        this.empId = empId;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    void calculateSalary() {
        // Validation
        if (basicSalary < 0 || bonus < 0) {
            System.out.println("Invalid Salary or Bonus!");
            return;
        }

        double netSalary = basicSalary + bonus;

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID : " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Net Salary  : " + netSalary);
    }
}

public class employe_payroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Bonus Amount: ");
        double bonus = sc.nextDouble();

        // Convert primitive values into Wrapper Objects
        Integer empId = Integer.valueOf(id);
        Double basicSalary = Double.valueOf(salary);
        Double bonusAmount = Double.valueOf(bonus);

        Employee e = new Employee(empId, basicSalary, bonusAmount);
        e.calculateSalary();

        sc.close();
    }
}