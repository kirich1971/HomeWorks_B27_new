package methods;

public class EachCharacterReplit {

    /*  Finish the method called countLetters() that will take a String argument str and returns a String.
    Find the frequency of each character in str and concatenate the frequency number with the character.
    Return the concatenated String with all the frequencies.
    The countLetters() method is already called in the main method with an argument.

    Example:
        countLetters("aaabbcccc");          a a a b b c c c c   -->   "a"      a a b c d d
        output:
            3a2b4c

        Example:
        countLetters("appleeess");
        output:
            1a2p1l3e2s
     */

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println(countLetters(in.next()));

        System.out.println(countLetters("appleeessa"));
    }

        public static String countLetters (String str){

            String output = "";
            for (int i = 0; i < str.length(); i++) {

                String letter = str.substring(i, i+1);

                if (!output.contains(letter)) {
                    int count = 0;
                    for (int j = 0; j < str.length(); j++) {
                        if (letter.equals(str.substring(j, j+1))) {
                            count ++;
                        }
                    }
                    output += "" + count + letter;
                }
            }
            return output;
        }
}

