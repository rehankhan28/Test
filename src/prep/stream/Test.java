package prep.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<List<String>> sentences = Arrays.asList(Arrays.asList("hello", "world"), Arrays.asList("java", "programming"), Arrays.asList("stream", "api"));
        List<String> allWords = sentences.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("All words: " + allWords);

        List<String> words = Arrays.asList("hello", "world", "java", "programming", "stream", "api");
        List<String> map = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Mapped words: " + map);
    }
}