package prep.array;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int a[] = {12, 23, 34, 6, 8, 9};
        int odd[] = Arrays.stream(a).filter(o -> o % 2 != 0).toArray();
        System.out.println(Arrays.toString(odd));
        System.out.println("==========Square===========");
        int sqr[] = Arrays.stream(a).map(o -> o * o).toArray();
        System.out.println(Arrays.toString(sqr));
    }
}
