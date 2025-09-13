package prep.javaeight;

public class Employee {
    String name;
    String department;
    int salary;

    Employee() {
    }

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}