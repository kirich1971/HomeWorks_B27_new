package methods;

public class MethodsExamples {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++ ) {
            printEven();
        }

        printOdd();
    }

/*  create a method that can print odd numbers between 1-100 in the
    same line saperated by space
*/


    public static void printOdd() {
        for (int i = 1; i <= 100; i += 2 ){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void printEven() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
