package prep.array;


import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
        int a[] = {11, 11, 22, 3, 3, 22, 45};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
