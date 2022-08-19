package methods;

public class MethodPolindrom {

    /*     create a method that will that will accept a String and find if it is Palindrome or not (boolean)
     */


    public static void main(String[] args) {

        System.out.println(isPalindrom("annA")) ;

        isPalindromVoid("Abcdedcba");
    }

    public static boolean isPalindrom(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i-- ) {
            revStr += str.charAt(i);
        }

         return str.equalsIgnoreCase(revStr);
    }


    public static void isPalindromVoid(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i-- ) {
            revStr += str.charAt(i);
        }

        System.out.println(str.equalsIgnoreCase(revStr));
    }

}
