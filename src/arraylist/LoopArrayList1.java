package arraylist;

import java.util.ArrayList;

public class LoopArrayList1 {
    /*  Try to loop:
        Create an ArrayList of Characters
        Fill the ArrayList with letters from a-z
        Print the ArrayList of all the characters

        Manually remove each vowels and print the new ArrayList
     */

    public static void main(String[] args) {

        ArrayList<Character>  alphabet = new ArrayList<>();

        for (char i = 'a'; i <= 'z' ; i++) {
            alphabet.add(i);
        }

        System.out.println(alphabet);

        alphabet.remove((Character) 'a');       // 'a' =   98
        alphabet.remove((Character) 'e');
        alphabet.remove((Character) 'i');
        alphabet.remove((Character) 'o');
        alphabet.remove((Character) 'u');

        System.out.println(alphabet);

    }

}
