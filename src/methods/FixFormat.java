package methods;

public class FixFormat {

    public static void main(String[] args) {

        System.out.println(properFormat("moTher"));

        System.out.println(properFormat("we all LOVE JAVA"));

    }

    /*   Fix Format
            create a method will accept a String and return a String in proper format. Proper format is:
            First character starting as uppercase and the rest as lowercase
            Ex:
                Input:
                    jamES

                Output:
                    James
     */

    public static String properFormat(String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
