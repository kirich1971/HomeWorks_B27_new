package methods;

public class CountDuplicateReplit {
    /* Finish the method called getDup() that will take a String[] argument arr and return an int.
    Find and return the number of duplicate elements. Any element is duplicate if it appears in the array more than once.
    The getDup() method is already called in the main method with an argument.
     */

    public static void main(String[] args) {

        String[] arr = {"1", "2", "aa", "1"};
        System.out.println(getDup(arr));

        String[] arr1 = {"1", "2", "aa", "1", "aa"};
        System.out.println(getDup(arr1));

        String[] arr3 = {"1", "g", "aabb", "7", "7", "2", "aa", "7", "7", "7", "g"};
        System.out.println(getDup(arr3));


    }

//    public static int getDup(String[] arr) {
//
//        int count = 0;
//        int duplicateCount = 0;
//        String[] duplicateArr = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int repeatCount = 0;
//            boolean hasDuplicate = false;
//
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if (i != j && arr[i].equals(arr[j])) {              // there is duplicate element
//                    repeatCount++;
//                }
//            }
//
//            for (String each : duplicateArr) {              // check is this element in the duplicate array
//                if (each != null && repeatCount > 0 && each.equals(arr[i])) {
//                    hasDuplicate = true;
//                    break;
//                }
//            }
//
//            if (!hasDuplicate && repeatCount > 0) {
//                duplicateArr[count++] = arr[i];
//                duplicateCount += repeatCount + 1;
//            }
//
//        }
//        return duplicateCount;
//    }


    public static int getDup(String[] arr) {
        int countDuplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (String eachElement : arr) {
                if (arr[i].equals(eachElement)) {
                    count++;
                }
            }
            if (count > 1) {
                countDuplicate++;
            }
        }

        return countDuplicate;

    }
}
