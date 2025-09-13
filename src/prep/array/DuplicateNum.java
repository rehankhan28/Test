package prep.array;


import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int a[] = {11, 11, 22, 3, 3, 22, 45};
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);
        //
    }
}
