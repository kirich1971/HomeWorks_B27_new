package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethodsExamples {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("one", "java", "Nadya", "four", "five", "one"));
        System.out.println(list1);

        Collections.sort(list1);                    // sorting collection by alphabet
        System.out.println("After sorting:");
        System.out.println(list1);

        Collections.shuffle(list1);                 // shuffle given collection
        System.out.println("After shuffle:");
        System.out.println(list1);

        String maxElement = Collections.max(list1);             // look and return  for the max element
        System.out.println("maxElement = " + maxElement);

        String minElement = Collections.min(list1);             // look and return for the min element
        System.out.println("minElement = " + minElement);

        int freq = Collections.frequency(list1, "Nadya");    // check and return frequency of specific element in our collection
        System.out.println("freq = " + freq);

        freq = Collections.frequency(list1, "one");
        System.out.println("freq = " + freq);

        freq = Collections.frequency(list1, "Kirill");
        System.out.println("freq = " + freq);


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("sdkgllgj';xzczxcxzckk';akgaksjgk".split("")));
        System.out.println(list2);
        System.out.println(Collections.frequency(list2, "k"));


        Collections.reverse(list1);                     // reverse our collection
        System.out.println(list1);


        Collections.swap(list1, 0, 1 );             // switch given elements
        System.out.println(list1);


        Collections.copy(list2, list1);                 //
        System.out.println(list2);

//        Collections.fill(list1, "Nadya");
//        System.out.println(list1);


        Collections.rotate(list1, 1);           // [1, 2, 3, 4, 5]   -->   [5, 1, 2, 3, 4]
        Collections.rotate(list1, 2);           // [1, 2, 3, 4, 5]   -->   [4, 5, 1, 2, 3]
        Collections.rotate(list1, 3);           // [1, 2, 3, 4, 5]   -->   [3, 4, 5, 1, 2]
        System.out.println(list1);

     }
}
