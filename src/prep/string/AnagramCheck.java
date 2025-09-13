package prep.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String s1 = Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        System.out.println(s1);
        String s2 = Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());
        System.out.println(s2);
        boolean opp = s1.equals(s2);
        System.out.println(opp);
    }
}