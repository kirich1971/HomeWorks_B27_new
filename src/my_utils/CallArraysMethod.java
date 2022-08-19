package my_utils;

import java.util.Arrays;

public class CallArraysMethod {

    public static void main(String[] args) {

        double[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(ArrayUtil.indexOf(arr, 8));

        String[] arr1 = {"One", "Two", "Three", "Four"};
        System.out.println(ArrayUtil.indexOf(arr1, "Two"));

        String[] arr2 = ArrayUtil.addElement(arr1, "Five");
        System.out.println(Arrays.toString(arr2));

        arr2 = ArrayUtil.addElement(arr2, "Six");
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = ArrayUtil.addElement(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

}
