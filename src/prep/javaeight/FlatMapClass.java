package prep.javaeight;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMapClass {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Long> charCountMap = str.replaceAll(" ", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCountMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}