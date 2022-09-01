package exeptions;

public class Timing {

    public static void main(String[] args) throws InterruptedException {

        System.out.print("Hello");

        try {
            Thread.sleep(3000);
        } catch(Exception e) {

        }
        System.out.print(" world ");

        Thread.sleep(3000);

        System.out.println(" Java");

        for (int i = 0; i < 50; i++) {
            System.out.print("- ");
            Thread.sleep(50);

        }


    }
}
