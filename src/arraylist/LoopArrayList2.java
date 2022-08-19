package arraylist;

import java.util.ArrayList;

public class LoopArrayList2 {
    public static void main(String[] args) {

        /*  Create an ArrayList of Double elements
            Fill the ArrayList with some values
            Find the max element from the ArrayList
         */

        ArrayList<Double>  numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Math.random());               // 0 - 1
        }

        numbers.add(13.69);
        numbers.add(454.69);
        numbers.add(77.00);
        numbers.add(130.9);
        numbers.add(3.44);
        numbers.add(8.90);

        System.out.println(numbers);

        double max = numbers.get(0);
        for (Double each : numbers) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println("Max= " + max);
    }
}
