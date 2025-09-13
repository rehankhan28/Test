package prep.javaeight;

import java.util.*;

public class LambdaExp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 5000),
                new Employee("Bob", "IT", 7000),
                new Employee("Charlie", "IT", 6000),
                new Employee("David", "Finance", 8000),
                new Employee("Eve", "HR", 5500));
        Optional<Employee> sal = employees.stream().max(Comparator.comparing(Employee::getSalary));
        if (sal.isPresent()) {
            Employee highestPaidEmployee = sal.get();
            System.out.println("Employee with highest salary: " + highestPaidEmployee.getName() + " with salary " + highestPaidEmployee.getSalary());
        } else {
            System.out.println("No employees found.");
        }
    }
}