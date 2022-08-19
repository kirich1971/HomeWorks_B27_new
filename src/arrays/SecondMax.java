package arrays;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 1, 4, 5, 8, 2, 5, 4, 8, 4, 8, 8, 8};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int size = numbers.length;
        int secondMax = 0;


        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > numbers[i - 1]) {

                secondMax = numbers[i - 1];
                break;
            }
        }

        System.out.println(secondMax);

    }
}
