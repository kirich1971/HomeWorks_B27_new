package methods;

public class CountAppearanceReplit {
    /*  Finish the method called countAppearance() that will take String [] and String arguments and return an int for
     the number of times the given String word is found in the given String [] arr.
        This is a return method with String[] and String parameters

     */

    public static int countAppearance(String[] arr, String word) {

        int count = 0;
        for (String each : arr) {

            if (each.equals(word)) {
                count ++;
            }
        }
        return count;
    }
}
