class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return employeeId + " " + name + " " + position + " Rs." + salary;
    }
}

public class Main {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    static void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search Employee
    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Traverse Employees
    static void traverseEmployees() {
        System.out.println("Employee Records:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Rahul", "Manager", 50000));
        addEmployee(new Employee(102, "Priya", "Developer", 45000));
        addEmployee(new Employee(103, "Amit", "Tester", 40000));

        traverseEmployees();

        System.out.println();

        searchEmployee(102);

        System.out.println();

        deleteEmployee(102);

        System.out.println();

        traverseEmployees();
    }
}
