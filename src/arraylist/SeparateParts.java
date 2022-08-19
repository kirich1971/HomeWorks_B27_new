package arraylist;

import java.util.ArrayList;

public class SeparateParts {
    /*  Separate Parts
        Write a program that can extract the special characters, digits and letters from a string and stores them into
        separate ArrayLists of Characters
            Ex:
            str = "ABCD123$%#@&456EFG!"
            list1: {$, %, #, @, &, !}
            list2: {A, B, C, D, E, F, G}
            list3: {1, 2, 3, 4, 5, 6}
     */

    public static void main(String[] args) {

        ArrayList<Character> listUpper = new ArrayList<>();
        ArrayList<Character> listLower = new ArrayList<>();
        ArrayList<Character> listDigit = new ArrayList<>();
        ArrayList<Character> listSpecial = new ArrayList<>();

        String str = "ABCD123$%#@&456EFG!";

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

            if (Character.isUpperCase(ch) ) {
                listUpper.add(ch);
            } else if (Character.isDigit(ch)) {
                listDigit.add(ch);
            } else if (Character.isLowerCase(ch)) {
                listLower.add(ch);
            } else {
                listSpecial.add(ch);
            }
        }

        System.out.println("String: " + str);
        System.out.println("listUpper = " + listUpper);
        System.out.println("listLower = " + listLower);
        System.out.println("listDigit = " + listDigit);
        System.out.println("listSpecial = " + listSpecial);

    }
}
