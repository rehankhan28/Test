package prep.javaeight;

import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list= List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int min=list.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Min value: " + min);
    }
}