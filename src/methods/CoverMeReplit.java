package methods;

public class CoverMeReplit {
    /*  Finish the method called coverString() that will take two String arguments main and coverMe and returns a String.
        Find each occurrence of the String coverMe in main. Wrap each occurrence of coverMe in square brackets.
        In the case that main does not have any occurrence of coverMe return a String with the whole main String wrapped
        in square brackets
        	"java methods", "me"
                output:
	            java [me]thods
    */

    public static void main(String[] args) {

    }

    public static String coverString(String main, String coverMe) {          //  10   cover 5

        int length = main.length() - coverMe.length();
        int covLen = coverMe.length();
        String subStr = "[" + coverMe + "]";

        if (!main.contains(coverMe)) {
            return "[" + main + "]";
        }
        return main.replaceAll(coverMe, subStr);

    }
}
