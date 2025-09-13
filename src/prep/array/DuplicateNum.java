package prep.array;


import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int a[] = {11, 22, 22, 33, 445};
        int max = Arrays.stream(a).min().getAsInt();
        System.out.println(max);
    }
}
