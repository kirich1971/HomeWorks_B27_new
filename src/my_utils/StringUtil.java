package my_utils;

/**  This class will be used to create String utility methods
 *
 */
public class StringUtil {

    public static void main(String[] args) {
        System.out.println(getDuplicateCharacters("AAABBBccDDDD"));
    }

    /**
     * Reverse the String and return it
     * @param   str any String
     * @return  reversed String
     */
    public static String reverse(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i-- ) {
            revStr += str.charAt(i);
        }
        return revStr;
    }


    /**
     * Take the string and check is this string palindrome or not <br> This method is NOT case-sensitive
     * @param str checked string
     * @return boolean
     */
    public static boolean isPalindrome(String str) {
        return  reverse(str).equalsIgnoreCase(str);
    }


    /**
     * Take the string and fix format to useful: first letter - uppercase, and the rest as lowercase <br>
     * Example:  jAMEs --> James
     * @param str input string
     * @return  output fixed string
     */
    public static String fixFormat(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }


    /**
     * Accept a String, of words separated by spaces, and return a camel case version of the String where the first letter
     * of each word is Uppercase and the rest of the word is in lowercase.
     * @param str incoming string
     * @return  camelcase version of incoming string
     */
    public static String camelCase(String str) {

        String[] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for (int i = 1; i < allWords.length; i++) {
            camelCase += fixFormat(allWords[i]);
        }
        return camelCase;
    }


    /**
     *  Given a String and char. Method determinate how many times the given char is found in the String. <br>
     *  This method is case-sensitive. МОй любимый метод
     * @param str given String 
     * @param letter given character 
     * @return number of characters repetition in the String
     */
    public static int frequencyOfChar(String str, char letter) {
        int counter = 0;

        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == letter) {
                counter ++;
            }
        }
        return counter;
    }


    /**
     * Take a String, find and return String with the duplicate characters. <br>
     * @param str incoming String
     * @return String contains duplicate characters
     */
    public static String getDuplicateCharacters(String str) {

        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {

            if (!duplicate.contains("" + str.charAt(i))) {

                int frequency = frequencyOfChar(str, str.charAt(i));
                if (frequency > 1) {
                    duplicate += str.charAt(i);
                }
            }
        }
        return duplicate;
    }
}
