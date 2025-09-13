package prep.string;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}