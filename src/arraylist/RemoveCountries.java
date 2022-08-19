package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /*      Remove Countries

        Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7

        @param nums - The given ArrayList of numbers
        @return - ArrayList of numbers

        Ex:
        Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
        Output: "Japan", "Korea", "Turkey", "Canada"

     */


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(list);

        System.out.println(checkWordsLength(list, 7));

        System.out.println(checkWordsLengthLambda(list, 5));

    }


    public static ArrayList<String>  checkWordsLength (ArrayList<String> list, int length) {

        ArrayList<String>  newList = new ArrayList<>();
        for (String each : list) {
            if (each.length() < length) {
                newList.add(each);
            }
        }
        return newList;
    }


    public static ArrayList<String>  checkWordsLengthLambda (ArrayList<String> list, int length) {

         list.removeIf( element -> element.length() > length );

         return list;
    }

    }
