package arraylist;

import java.util.ArrayList;

public class ArryListCharacters {
    public static void main(String[] args) {

     /*  Create an ArrayList of Characters
            Fill the ArrayList with letters of your name. Each letter as a different element
            Print each letters on a separate line by accessing each element
      */

        ArrayList<Character>  letter = new ArrayList<>();

        letter.add('T');   // 0
        letter.add('a');   // 1
        letter.add('t');
        letter.add('s');
        letter.add('i');
        letter.add('a');
        letter.add('n');
        letter.add('a');   // 7

        System.out.println(letter);
        System.out.println("Length" + letter.size());

        System.out.println(letter.get(0));
        System.out.println(letter.get(1));
        System.out.println(letter.get(2));
        System.out.println(letter.get(3));
        System.out.println(letter.get(4));
        System.out.println(letter.get(5));
        System.out.println(letter.get(6));
        System.out.println(letter.get(7));

        /// -------------- addons -------------------------

        for (int i = 2; i < letter.size(); i++) {
            System.out.println(letter.get(i));
        }

        System.out.println(letter.get(0));

        for (Character each : letter) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");

        System.out.println(letter);

        int size = letter.size();
        for (int i = 0; i < size; i++) {
            System.out.println(letter.remove(0));
            System.out.println(letter);
        }

        System.out.println(letter);

    }
}
