package interview_tasks;

public class SnakeCase {
    public static void main(String[] args) {
        /*       Task 4 :     Convert PascalCase to snake_case  --- Interview Task
    			  write a method that get pascal case and convert to pascal case to snake case and return it

                  "TestController"  --> "test_controller"

                  "MoviesAndBooks"  --> "movies_and_books"
                  "App7Test"        --> "app7_test"
                  "1"               --> "1"
         */

        String input = "App7Test";
        String result = "";

        int prevUpperCaseLetter = 0;                                                        // store the index of previous capital letter

        if (input.length() != 1) {
            for (int i = 1; i < input.length(); i++) {

                if (Character.isUpperCase(input.charAt(i))) {                                  // we check the Capital letter if yes any letters before - whole word
                    result += input.substring(prevUpperCaseLetter, i).toLowerCase() + "_";
                    prevUpperCaseLetter = i;                                                    //  reassignment index (or place)  of Capital letter
                }

                if (i == input.length() - 1) {                                                    // check   or we got the end of the string,   that means we have a last word
                    result += input.substring(prevUpperCaseLetter, i + 1).toLowerCase();
                }
            }
        } else {
            result = input.toLowerCase();
        }
        System.out.println(result);
    }
}
