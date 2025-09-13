package interview;

import java.util.*;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "ABCD"));
        list.add(new Student(12, "DEF"));
        list.add(new Student(10, "Rahul"));
        list.add(new Student(11, "DEF"));
        Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(Student::getId, Collectors.counting()));
        System.out.println(countMap);
        Long count = countMap.get(12);
        System.out.println(count);
    }
}