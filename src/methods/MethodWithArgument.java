package methods;

public class MethodWithArgument {

    public static void main(String[] args) {

        printHello("Anait");

        printHello("Jay");

        printHello("Nicolae");

        printHelloNTimes("Kirill", 5);

        String str = "sdgmsf dlgkn";

        manyNumbers(1);
        manyNumbers(1, 2);
        manyNumbers(1, 2, 3);
        manyNumbers(1, 2, 3, 4, 5);


    }

    public static void printHello (String name) {
        System.out.println("Hello " + name );

    }


    public static void printHelloNTimes(String nameOne, int num) {
        for (int i = 0; i < num; i++) {
            printHello(nameOne);
        }
    }

    public static void manyNumbers (int ... a) {

        int summ = 0;
        System.out.println(a.length);

        for (int i : a) {
            summ += i;
        }
        System.out.println(summ);
    }

}
