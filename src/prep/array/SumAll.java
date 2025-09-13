package prep.array;

import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
    }
}