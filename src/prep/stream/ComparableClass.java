package prep.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableClass {
    public static void main(String[] args) {
        List<List<String>> nestedLists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d", "e"));
        List<String> flattenedList = nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened list: " + flattenedList);
    }
}