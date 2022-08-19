package methods;

public class CharacterMethods {

   /*      - make method that will print all the letters from A to Z
            - make method that will print all the letters from a to z
            - make method that will print all the letters from Z to A
            - make method that will print all the letters from z to a
            - make method that will print all the letters from 0 to 9
     */

    public static void main(String[] args) {

        printChar('A', 'Z');

        printChar('a', 'z');

        printChar('0', '9');

        printChar('z', 'a');

        printChar('0', 'z');

        printCharWithCode('0', 'z');
    }



    public static void printChar(char from, char to) {

            for (char letter = from; letter <= to; letter ++) {
                System.out.print(letter + " ");
            }

            for (char letter = from; letter >= to; letter --) {
                System.out.print(letter + " ");
            }
            System.out.println();
    }


    public static void printCharWithCode(char from, char to) {

        for (char letter = from; letter <= to; letter ++) {
            System.out.print(letter + "-" + (int)letter + ", ");
        }

        for (char letter = from; letter >= to; letter --) {
            System.out.print(letter + "-" + (int)letter + ", ");
        }
        System.out.println();

    }


    public static void capitalLetters(           ) {
        for (int i = 'A'; i <= 'Z' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void lowerLetters() {
        for (int i = 'a'; i <= 'z' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }


    public static void capitalLettersReverse() {
        for (int i = 'Z'; i >= 'A' ; i--) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void lowerLettersReverse() {
        for (int i = 'z'; i >= 'a' ; i--) {
            System.out.print("" + (char) i + " ");
        }
    }

    public static void number() {
        for (int i = '0'; i <= '9' ; i++) {
            System.out.print("" + (char) i + " ");
        }
    }

}
