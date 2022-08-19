package methods;

public class LongestRepetitiveSubstring {
    public static void main(String[] args) {

/*      Task 5 : Longest Repetitive Substring -- Real Interview Task

    		Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    		Your program should return longest substring K, and
    		if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef
    					   str ="abcdefabcdefabcdefabcdef"     output should be abcdefabcdef
    					   str ="abcdefxdsfdsfabcdef"				   output should be "There is no repetitive substring"
    					         abcdef abcdef
 */
        String str = "aaaaaa";
//                    012345678901
        int l = str.length();
        int subStrLength = 0;

        String subStr = "";
        String longestSubStr = "";


        for (int j = 1; j < l; j++) {
            subStr = str.substring(0, j);    //  j = 6    abcdef

            if (str.substring(j).startsWith(subStr) && subStrLength < subStr.length()) {
                subStrLength = subStr.length();
                longestSubStr = subStr;
            }
        }

        if (subStrLength != 0) {
            System.out.println(longestSubStr);
        } else {
            System.out.println("There is no repetitive substring");
        }
    }
}


/*
        for (int i = 0; i < l; i ++) {

            for (int j = i+1; j < l; j++) {
                subStr = str.substring(i, j);

//                if (str.substring(j).contains(subStr) && subStrLength < subStr.length()) {
                if (str.substring(j).startsWith(subStr) && subStrLength < subStr.length()) {

                    subStrLength = subStr.length();
                    longestSubStr = subStr;

                }
            }
        }
*/
