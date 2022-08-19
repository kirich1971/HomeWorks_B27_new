package arraylist;

import my_utils.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    /*  All Palindrome

        Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
        Ignore case sensitivity
            Ex:
            Input:
                 "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
            Output:
                Anna, Racecar, Level, Eye
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(words);

        System.out.println( listOfPalindrome(words) );

    }


    public static ArrayList<String>  listOfPalindrome (ArrayList<String> list) {

        ArrayList<String> pollindromeList = new ArrayList<>();
        for (String each : list) {

            if (StringUtil.isPalindrome(each.toLowerCase())) {
                pollindromeList.add(each);
            }
        }

        return pollindromeList;
    }
}
