package arrays;

import java.util.Arrays;

public class PrintCommonElement {

    /*   Write a program that can print out the common elements from each inner element of a 2D array
        Ex:
           int[][] arr {
                  {4, 1, 24, 5},
                  {24, 1, 5, 2, 1, 1},
                  {4, 1, 5, 1}
           }
     */

    public static void main(String[] args) {

        int[][] arr = {
                {4, 1, 24, 5 , 2 , 2, 5 },      // [0][0],   [0][1],    [0][2],    [0][3]
                {24, 1, 5, 2, 2 },              // [1][0],   [1][1],    [1][2],    [1][3]
                {4, 1, 5, 1, 2}                 // [2][0],   [2][1],    [2][2],    [2][3]
        };


        // PART 1.  Just print common element to console
        // USING REGULAR FOR LOOP

        for (int i = 0; i < arr[0].length; i++) {           // go through first array

            for (int j = 0; j < arr[1].length; j++) {       // go through second array

                if (arr[0][i] == arr[1][j]) {               // compare each element of 1-st array with each elements of 2-nd array

                    for (int k = 0; k < arr[2].length; k++) {      // if element of 1-st == element of 2-nd go through 3-rd array

                        if (arr[0][i] == arr[2][k]) {               // and compare this element with each from there
                            System.out.println(arr[0][i]);          // if equals print this element
                            break;
                        }
                    }
                }
            }
        }


        // Part 2.  Collect all common elements to the new array and print it after.
        // USING FOR EACH LOOP

        int[] commonArray = new int[arr[0].length + arr[1].length + arr[2].length];        // declare new array to collect all common elements
        int count = 0;                                     // declare counter

        for (int eachFrom1 : arr[0]) {

            for (int eachFrom2 : arr[1]) {

                if (eachFrom1 == eachFrom2) {
                    for (int eachFrom3 : arr[2]) {
                        if (eachFrom1 == eachFrom3) {
                            commonArray[count] = eachFrom1;    // put common element to the new array
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(commonArray));


        for (int i = 0; i < commonArray.length; i++) {          // loop for check NON Unique elements in common Array
                                                                // and reassign to 0
            if (commonArray[i] != 0) {
                for (int j = 0; j < commonArray.length; j++) {
                    if (i != j && commonArray[i] == commonArray[j]) {
                        commonArray[j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(commonArray));


        count = 0;
        for (int eachCommon : commonArray) {        // go through all elements of commonArray for counting NOT NULL element
            if (eachCommon != 0) {
                count ++;
            }
        }

        int[] finalArray = new int[count];          // declare final Array to collect all NOT-NULL elements (length = count)

        count = 0;
        for (int eachNew : commonArray) {            // go through all elements of commonArray
            if (eachNew != 0) {
                finalArray[count++] = eachNew;        // put NOT-NULL element into final array
            }
        }

        System.out.println(Arrays.toString(finalArray));

    }
}