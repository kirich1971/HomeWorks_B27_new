package my_utils;

import java.util.Arrays;

public class ArrayUtil {

    /**
     *   the method that will accept an int array and return the smallest number from the array
     * @param arr given int array
     * @return smallest number from the array
     */
    public static int minNumber(int ... arr) {

        int min = 100000000;
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    /**
     * create a method that will accept an int array and return the biggest number from the array
     * @param arr given int array
     * @return biggest number from the array
     */
    public static int maxNumber(int ... arr) {

        int max = -100000000;
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    /**
     * takes the array of integer anr return summary of all elements of this array
     * @param arr array of int
     * @return summary of all elements of our array
     */
    public static int sumArray(int ... arr) {

        int summ = 0;
        for (int each : arr) {
            summ += each;
        }
        return summ;
    }


    /**
     *  the method that will accept an int array and an int number. Check and return if the given number is in the array
     * @param arr input array
     * @param target input number
     * @return is given array contains giver number
     */
    public static boolean isContains (int[] arr, int target) {

        for (int each : arr) {
            if (target == each) {
                return true;
            }
        }
        return false;
    }


    /**
     *  the method that will accept an String array and String. Check and return if the given String is in the array
     * @param arr input array
     * @param target input String
     * @return is given array contains giver String
     */
    public static boolean isContains (String[] arr, String target) {

        for (String each : arr) {
            if (target.equals(each)) {
                return true;
            }
        }
        return false;
    }


    /**
     * the method that will accept an int array and an int number. Find and return the index of the number in the array. <br>
     *         If there is multiple occurrence return the first occurrence's index
     * @param arr given int array
     * @param target given number
     * @return index of the number in the given array
     */
    public static int indexOf(int[] arr, int target) {

        return indexOf(arr, target, 0);
    }


    /**
     * the method that will accept an int array and an int number. Starts with given index. Find and return the index of the number in the array. <br>
     *         If there is multiple occurrence return the first occurrence's index
     * @param arr given int array
     * @param target given number
     * @param startIndex given starting index
     * @return index of the number in the given array
     */
    public static int indexOf(int[] arr, int target, int startIndex ) {

        for (int i = startIndex; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    /**
     * the method accepts an String array and an String var. Find and return the index of the given String in the array. <br>
     *         If there is multiple occurrence return the first occurrence's index
     * @param arr given String array
     * @param word given number
     * @return index of the number in the given array
     */
    public static int indexOf(String[] arr, String word) {

        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }


    /**
     * the method that will accept a double array and an int number. Find and return the index of the number in the array. <br>
     *         If there is multiple occurrence return the first occurrence's index
     * @param arr given double array
     * @param num given number
     * @return index of the number in the given array
     */
    public static int indexOf(double[] arr, double num) {

        for (int i = 0; i < arr.length; i++) {
            if ( num == arr[i] ) {
                return i;
            }
        }
        return -1;
    }


    /**
     *  the method accept an int array and an int number. Return an array with the given number added to the end of the array
     * @param array given array
     * @param num given number
     * @return array with the given number at the end
     */
    public static int[] addElement(int[] array, int num) {

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = num;

        return newArray;
    }


    /**
     * the method that will accept a String array and a String element. Add the given element value into the end of the array
     * @param array given array
     * @param element given String
     * @return array with the given String element at the end
     */
    public static String[] addElement(String[] array, String element ) {

        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    /**
     * the method that will accept two String arrays. Add the second array's value into the end of the first array
     * @param original given original
     * @param other given other
     * @return array contains both arrays
     */
    public static String[] addElement(String[] original,  String[] other) {

        String[] merged = original;
        for (String each : other) {
            merged = addElement(merged, each);
        }
        return merged;
    }

}
