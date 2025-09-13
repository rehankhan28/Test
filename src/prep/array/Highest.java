package prep.array;

import java.util.Arrays;
import java.util.Comparator;

public class Highest {
    public static void main(String[] args) {
        int a[] = {12, 21, 12, 34, 45, 56, 76};
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Max: " + max);
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Min : " + min);
        int sort[] = Arrays.stream(a).sorted().distinct().toArray();
        System.out.println("Sorted : " + Arrays.toString(sort));
        int rev[] = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).distinct().toArray();
        System.out.println("Reverse : " + Arrays.toString(rev));
    }
}
