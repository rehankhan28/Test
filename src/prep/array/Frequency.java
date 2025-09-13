package prep.array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Long> map = Arrays.stream(numbers).mapToObj(Integer::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + "\t\t" + v));
    }
}
