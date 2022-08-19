package methods;

import java.util.ArrayList;

public class FuelReplit {
    /* Finish the method called refuels() that will take an ArrayList<Integer> argument deliveries and an int gasTank.
    The method returns an int for the number of refuels needed. The given values in deliveries tells the amount of fuel
    needed for each delivery and the gasTank argument define the max capacity of fuel the car can hold. Use all the given
    information to determine how much total times the driver will need to stop to refuel. The refuels() method is
    already called in the main method with an argument.
        Example:
            refuels([7, 7, 7], 7)                   -->   21 mi    /     7 mi     total length  /  available length   =   quantity of refuel
        output:
            3
            (3 fuel stops 7 units each delivery)
        Example:
            refuels([9, 1],  3)
        output:
            4
            (3 fuel stops for first delivery and +1 stop for second)
        Example:
            refuels([100, 200, 10],   10)
        output:
            31
     */


    public static void main(String[] args) {



    }


    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {

        int sum = 0;                                    // total millage
        for (Integer each : deliveries) {
            sum += each;
        }

        if (sum % gasTank == 0 ) {                     //      total / available ==  result
            return sum / gasTank;
        }
        return sum / gasTank + 1;
    }
}
