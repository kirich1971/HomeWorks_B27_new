package arrays;

public class UniqueNumbersReplit {
    /*  Finish the method called printUniqueNumbers() that will take anint [] and print out all of the unique numbers
        in the array. A number is unique when it is only found in the array one time.

                Example:
                    nums = [2, 5, 5, 6, 3, 6, 9, 34, 3];
                    printUniqueNumbers(nums)

                    output:
                      2
                      9
                      34

                Example:
                nums = [4, 5, 11, 5, 6, 1, 4];
                  printUniqueNumbers(nums)
                output:
                  11
                  6
                  1
     */

    public static void printUniqueNumbers(int[] nums){

        for (int i = 0; i < nums.length; i++) {           //  [2, 5, 5, 6, 3, 6, 9, 34, 3];

            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
