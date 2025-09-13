package prep.javaeight;

import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        int a[] = {1, 22, 13, 24, 76, 89, 55};
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println(max);
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);
    }
}