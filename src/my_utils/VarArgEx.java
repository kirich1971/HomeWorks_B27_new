package my_utils;

public class VarArgEx {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printAll(arr);

        System.out.println();

        printDynamicAll(arr);

        System.out.println();

        printDynamicAll(1, 2, 3, 4, 5, 8, 8, 9, 90);

    }

    public static void printAll(int[] arr) {
        for (int each : arr) {
            System.out.print(each + " ");

        }
    }

    public static void printDynamicAll(int ... arr) {
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }
}
