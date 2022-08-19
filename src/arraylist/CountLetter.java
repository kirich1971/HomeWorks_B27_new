package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetter {
    /*  Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
            Ex:
            Input:
                ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
                letter: ‘a’
            Output:
                6
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(list);

        System.out.println("count: " + countLetter(list, 'a'));
    }

    public static int countLetter(ArrayList<String> list, char ch) {

        String str = "";
        for (String each : list) {
            str += each;
        }
        System.out.println("str: " + str);

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);

        return Collections.frequency(list1, "" + ch);
    }

}
