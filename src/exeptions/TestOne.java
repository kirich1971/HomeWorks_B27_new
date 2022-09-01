package exeptions;

public class TestOne {
    public static void main(String[] args)  throws  Exception {

        try {

            int[] array = {1, 2, 3, 4, 5, 6};    // length = 6   012345

            for (int i = 0; i <= 10; i++) {
                System.out.println(array[i]);
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {        //  code which inform me about Exception
            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally block");
        }

        Thread.sleep(1000);

        System.out.println("After finally block");
        System.out.println("End of our code");

    }
}
