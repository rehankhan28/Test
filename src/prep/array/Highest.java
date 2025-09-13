package prep.array;

import java.util.Arrays;

public class Highest {
    public static void main(String[] args) {
        int a[] = {12, 21, 12, 34, 45, 56, 76};
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Max: " + max);
    }
}
