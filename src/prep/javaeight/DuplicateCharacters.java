package prep.javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World Hello World";
        Map<Character, Long> charcount = str.replaceAll(" ", "").chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charcount.forEach((k, v) -> System.out.println(k + " " + v));

        Map<String, Long> strCount = Arrays.stream(str.split("\\s")).collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        strCount.forEach((k, v) -> System.out.println(k + " " + v));
    }
}