package arrays;

public class MergeArrayReplit {
/*      Finish the method called merge() that will take two int[] argument a and b and returns an int[].
        Merge the given two arrays into one and return the merged array. Merging the elements will mean adding all the
        elements from a and then adding all the elements of b into the array after. The merge() method is already
        called in the main method with an argument.
 */


    public static void main(String[] args) {

    }


    public static int[] merge(int[] a, int[] b) {     //  a = [1,2,3,4]        b = [9,8,7,6]

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {           // c = [1,2,3,4,0,0,0,0]
            c[i] = a[i] ;
        }

        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }

        int index = a.length;           // 4
        for (int each : b) {
            c[index ++] = each;
        }

        return c;
    }
}
