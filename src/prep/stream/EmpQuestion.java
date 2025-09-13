package prep.stream;

import java.util.ArrayList;
import java.util.List;

public class EmpQuestion {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "A", 1000, "IT"));
        list.add(new Employee(2, "B", 2000, "HR"));
        list.add(new Employee(3, "C", 3000, "IT"));
        list.add(new Employee(4, "D", 4000, "HR"));
        list.add(new Employee(5, "E", 5000, "IT"));
        list.add(new Employee(6, "F", 6000, "HR"));
        list.add(new Employee(7, "G", 7000, "IT"));
        List<Employee> l=list.stream().filter(n->n.getName().startsWith("A")).toList();
        l.forEach(n->System.out.println(n));
    }
}
