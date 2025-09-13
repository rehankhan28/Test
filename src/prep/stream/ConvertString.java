package prep.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "Rehan");
        String result = words.stream().map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}