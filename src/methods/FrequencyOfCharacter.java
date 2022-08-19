package methods;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        System.out.println(freqOfChar("apple", 'p'));

        System.out.println(freqOfChar("apple", 'z'));

        System.out.println(freqOfChar("aabbaacca", 'a'));

    }

/*    Frequency of Character
create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
Ex:
	Input:
		apple, p
	Output:
		2
Ex:
	Input:
		apple, z
	Output:
		0
Ex:
	Input:
		aabbaacca, a
	Output:
		5

 */

    public static int freqOfChar(String str, char ch) {
        int counter = 0;

        for (int i = 0; i < str.length(); i ++) {

            if (str.charAt(i) == ch) {
                counter ++;
            }
        }
        return counter;
    }

}
