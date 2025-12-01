package lambdaEX;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    // Method to return ArrayList of Employee objects
    public static List<Employee> get() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", "Doe", "IT", "Developer", 60000, 28));
        employees.add(new Employee(102, "Jane", "Smith", "HR", "HR Manager", 75000, 35));
        employees.add(new Employee(103, "Robert", "Brown", "Finance", "Accountant", 55000, 30));
        employees.add(new Employee(104, "Emily", "Davis", "Marketing", "Marketing Lead", 70000, 32));
        employees.add(new Employee(105, "Michael", "Wilson", "IT", "System Analyst", 65000, 29));
        employees.add(new Employee(106, "Sophia", "Taylor", "Sales", "Sales Executive", 50000, 26));
        employees.add(new Employee(107, "John", "Doe", "HR", "Manager", 60000, 28));

        return employees;
    }

   
}
