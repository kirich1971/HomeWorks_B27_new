package methods;

public class ReturnMethods {
    public static void main(String[] args) {

        String str;
        str = reverseString("Hello world");
        System.out.println(str);

        String str1 = reverseString("I love Java");
        System.out.println(str1);

//        int i = new Scanner(System.in).nextInt();

        System.out.println(reverseString("I hate Java"));


        String s1 = "ABCDEFJHI";

        System.out.println(s1.length());

        System.out.println(len(s1));


        String string1 = "racecar";

        System.out.println(string1.equals(reverseString(string1)) ? "polindrom" : "non polindrom");

    }

    // reverse the string
    public static String reverseString (String str) {           // NonVoidMethods.reverseString("String");

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i-- ) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }


    public static int len (String str) {

        int i = 0;
        for (int j = 0; j < str.length(); j++ ) {
            i++;
        }
        return i;
    }

}
