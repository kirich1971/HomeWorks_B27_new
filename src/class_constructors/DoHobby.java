package class_constructors;

import java.util.ArrayList;

public class DoHobby {
   /*     Create a separate class to create and test the class_constructors.Hobby objects
        - create an ArrayList of class_constructors.Hobby objects
        - create and add a couple class_constructors.Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each class_constructors.Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

    */

    public static void main(String[] args) {

        ArrayList<Hobby> arrHobbies = new ArrayList<>();

        Hobby hobby1 = new Hobby("bowling");
            hobby1.isOutdoors = false;
            hobby1.annualCost = 1000;
            hobby1.reqOthers = true;

        Hobby hobby2 = new Hobby("knitting", 250, false, false);

        Hobby hobby3 = new Hobby("soccer", 400, true, true);

        Hobby hobby4 = new Hobby("football", 5000, true, true);

        Hobby hobby5 = new Hobby("poker", 50000, false, true);


        arrHobbies.add(hobby1);
        arrHobbies.add(hobby2);
        arrHobbies.add(hobby3);
        arrHobbies.add(hobby4);
        arrHobbies.add(hobby5);
        System.out.println(arrHobbies);

        ArrayList<Hobby> indoorHobbies = new ArrayList<>();
        // we create Arrylist of <Object> (class_constructors.Hobby)  and put every of our class_constructors.Hobby-object into this list


        // method # 1
        for (Hobby each : arrHobbies) {             // for-each loop
            each.doIt();
            if (!each.isOutdoors) {                 // checking the indoor hobby and put into the new arraylist
                indoorHobbies.add(each);
            }
       }
        System.out.println(indoorHobbies);


        // method # 2
        ArrayList<Hobby> otherReqList = new ArrayList<>(arrHobbies);   // bulk method
        otherReqList.removeIf( p -> p.reqOthers );
        System.out.println(otherReqList);

        //    list.removeIf ( element   ->       element something == true )



        // method # 3
//        ArrayList<class_constructors.Hobby> cheapHobbyList = new ArrayList<>();     // traditional loop
//        for (int i = 0; i < arrHobbies.size(); i++) {
//            if (arrHobbies.get(i).annualCost < 500) {
//                cheapHobbyList.add(arrHobbies.get(i));
//            }
//        }

        ArrayList<Hobby> cheapHobbyList = new ArrayList<>(arrHobbies);     // bulk method
        cheapHobbyList.removeIf( hobby -> hobby.annualCost > 500);

        System.out.println(cheapHobbyList);

    }

}
