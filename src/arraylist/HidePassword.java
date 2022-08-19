package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*  Hide passwords
        Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a
            star and print the ArrayList of hidden passwords
        Ex:
        Input:
        {"one", "hi", "hold}

        Output:
        [ ***, **, **** ]
     */

    public static void main(String[] args) {

        ArrayList<String>  passList = new ArrayList<>(Arrays.asList("one", "hi", "hold", "fiveveve"));
        System.out.println(passList);

        System.out.println(hidePassword(passList));
    }

    public static ArrayList<String> hidePassword(ArrayList<String>  passList) {

        ArrayList<String>  hiddenList = new ArrayList<>();

        for (String word : passList) {
            hiddenList.add(numOfStars(word.length()));
        }
        return hiddenList;
    }


    public static String numOfStars(int num) {
        String stars = "";
        for (int i = 0; i < num; i++) {
            stars += "*";
        }
        return stars;
    }

}
