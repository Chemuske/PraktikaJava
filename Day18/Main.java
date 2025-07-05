package Day18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
        System.out.println(count7(717771237));
    }

    public static int recursionSum(int[] numbers) {
        if (numbers.length > 0) {
            return numbers[0] + recursionSum(Arrays.copyOfRange(numbers, 1, numbers.length));
        } else return 0;
    }

    public static int count7 (int number) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 7) {
            return 1 + count7(number / 10);
        } else {
            return count7(number / 10);
        }
    }
}
