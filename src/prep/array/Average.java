package prep.array;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        double avg = Arrays.stream(a).average().getAsDouble();
        System.out.println(avg);
    }
}