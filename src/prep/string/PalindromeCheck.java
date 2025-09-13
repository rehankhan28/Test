package prep.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        Optional<String> longword = Arrays.stream(str.split("\\s")).max(Comparator.comparing(String::length));
        longword.ifPresent(w -> System.out.println(w));
    }
}