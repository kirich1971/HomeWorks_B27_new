package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsExamples {
    public static void main(String[] args) {

//        ArrayList<Integer> numList = EasyData.getRandomNumbers(10);

        ArrayList<Integer> numList = new ArrayList<>();                     // created ArryList  initial size - 10
        ArrayList<Integer> numList1 = new ArrayList<>(100);      // created ArryList  initial size - 100

        Integer [] num = {1,2,3,4,5,6,7,8,9,0};                                 // create array of Integer
        ArrayList<Integer> numList2 = new ArrayList<>(  Arrays.asList(num)  );  // create ArrayList and put into them our array
        System.out.println(numList2);


        System.out.println("\n-------------- methods .add() ------------------------");
        numList2.add(700);                                     // add element in the end of ArrayList
        System.out.println(numList2);

        numList2.add(5, 500);                     // insert element with given index
        System.out.println(numList2);

        System.out.println("size: " + numList2.size());        // output: 12

        int element = numList2.get(3);                         // access to the element of arraylist with index 3
        System.out.println("element = " + element);

        int index = numList2.indexOf(element);                  // return the index of given element
        System.out.println("index = " + index);
        System.out.println("last index= " + numList2.lastIndexOf(element));


        System.out.println("\n-------------- methods .remove() ------------------------");

//        numList2.remove(  numList2.lastIndexOf(500)   );      // remove last element of 500
        int removedElement = numList2.remove(4);          // method remove element with given index AND return the element
        System.out.println("removedElement = " + removedElement);
        System.out.println(numList2);

        // remove by element
        numList2.remove((Integer) 600);                         // method remove given element it if exist, return boolean --> false
        numList2.remove((Integer) 500);                         // method remove given element it if exist, return boolean --> true


        System.out.println("\n-------------- method .contains() ------------------------");

        System.out.println("is contains 6: " + numList2.contains(6));        // return true if element is exists  /  false if not


        System.out.println("\n-------------- method .equals() ------------------------");

        ArrayList<Integer> numList3 = numList2;
        ArrayList<Integer> numList4 = new ArrayList<>(numList2);

        System.out.println("numList3 == numlist2: " + (numList3 == numList2));              // output:  true
        System.out.println("numList3 equals numlist2: " + numList3.equals(numList2));       // output:  true

        System.out.println("numList4 == numlist2: " + (numList4 == numList2));              // output:  false
        System.out.println("numList4 equals numlist2: " + numList4.equals(numList2));       // output:  true


        numList3.remove(0);                                     // removed element from numList3 (or numList2)

        System.out.println("numList3 == numlist2: " + (numList3 == numList2));              // output:  true
        System.out.println("numList3 equals numlist2: " + numList3.equals(numList2));       // output:  true

        System.out.println("numList4 == numlist2: " + (numList4 == numList2));              // output:  false
        System.out.println("numList4 equals numlist2: " + numList4.equals(numList2));       // output:  false


        System.out.println("\n-------------- method .set() ------------------------");

        System.out.println(numList2);
        int replaced = numList2.set(2, 400);                  // replace the element with given index and return us element that was replaced
        System.out.println(numList2);
        System.out.println("replaced = " + replaced);

        numList2.addAll(numList4);                          // add other List to our List
        System.out.println(numList2);

    }

}
