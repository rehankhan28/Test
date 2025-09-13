package prep.javaeight;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreq {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character,Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}