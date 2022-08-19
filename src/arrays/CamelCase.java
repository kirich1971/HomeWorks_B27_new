package arrays;

public class CamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));

    }

/*  create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd
	Output:
		javaWillRuleTheWorld
     */


    public static String camelCase(String str) {

        String[] strArr = str.toLowerCase().split(" ");

        String camCase = strArr[0];

        for (int i = 1; i < strArr.length; i++) {
            camCase += strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
        }
        return camCase;
    }


//    public static String camelCase(String str) {
//
//        str = str.toLowerCase();
//        String camCase = "";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == ' ') {
//                camCase += str.substring(i+1, i+2).toUpperCase();
//                i ++;
//            } else {
//                camCase += str.charAt(i);
//            }
//        }
//
//        return camCase;
//    }
}
