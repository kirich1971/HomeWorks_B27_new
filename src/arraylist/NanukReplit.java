package arraylist;

import java.util.ArrayList;

public class NanukReplit {
    /*      In the Eskimo language nanuk means polar bear. When the tribe men go hunting they need to select a leader,
    each men boasts on how many fish, elk or other animals he can hunt. Then they vote who will lead them. A successful
    hunt for the leader is when they managed to hunt as much as he boasted and the hunting party managed to avoid a polar
    bear (nanuk) which can ruin a whole hunt. Experienced hunters know ways to avoid polar bears using way stones to mark
    these areas.
    Finish the method called hunt() that will take three arguments: an ArrayList<String> result, int wayStones and int boast.
    The method returns a boolean, about if the hunt was successful or not. Use the guidelines below to determine if a hunt
    was successful or not. The hunt() method is already called in the main method with an argument.

            Example:
            nanuk(["1","2","3","5"], 0, 5)
            output:
                true
                (no nanuks, and catches are 11 which is more than 5 that leader boasted)

            Example:
                nanuk(["1","nanuk","3","5"], 0, 5)
            output:
                false
                (They encountered nanuk but had 0 way stones)

            Example:
                nanuk(["1","3"], 0, 5)
            output:
                false

            Example:
                nanuk(["1","10","3","nanuk"], 2, 7)
            output:
                true

            Example:
                nanuk(["1","10","3","nanuk","nanuk"], 2, 7)
            output:
                true

            Example:
                nanuk(["1","10","3","nanuk","nanuk","nanuk"], 2, 7)
            output:
                false
     */

    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int nanukCount = 0,  catches = 0;

        for (String each : result) {
            if (each.equalsIgnoreCase("nanuk")) {
                nanukCount ++;
            } else {
                catches += Integer.parseInt(each);
            }
        }

        return ( nanukCount <= wayStones  &&  catches >= boast );

    }

}
