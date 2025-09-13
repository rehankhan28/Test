package prep.array;

public class SumTwo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int targetSum = 9;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println(numbers[i] + "\t\t" + numbers[j]);
                }
            }
        }
    }
}