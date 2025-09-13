package prep.javaeight;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55, 66};
        int second = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);
    }
}